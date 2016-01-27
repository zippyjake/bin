#!/usr/bin/env python3
import os
import time
import sys
import skilstak.colors as c
if __name__ == '__main__':
    try:
        names = ['applepie','bobe','canond','dfk','ethan','greydog8','jasond','marshall','ninjanick','tdgtroy','yolo','aidans','asteroidgamez','bobulousness','carsons','drake','grierg','joeyl','mathew','noahb','ryand','tendt','aidenh','atobi16','bomer','carsonw','drears','etmajo','gseventeen','johne','matthewb','noahbu','samb','terminator','aidenm','austinn','bos','carsten','durza','evanw','hannah','jt','mayab','noahs','saml','alejandro','beanboybunny','boxerdude','cgamer','ebeth','gabbies','hilol','katie','meganv','noahw','samson','trevorp','bella320','bradym','charliem','gabe','ianh','keegan','millermobs','novious','seths','tripp','alexgeorge','benjabob317','braxtonh','colev','endergirl','garrisonb','insanis','kevins','mpberini','omar','smokiemario','tslnc04','alexs','benw','braydenh','crusher','enderwing','gfred','jacks','landon','oscara','tylercarr','alvarezjed','betropper','brookie','danyl','epicalex','gordica','jackt','legodude','netherq','pizzaman','sully','whirlsam','anders','blackflag','brooksb','darcy','ericf','gotoyota','jaja','link','netherwoman','pony','tallon','wills','blah','cal','darknight','grant','jakobbas','marcusg','nickrocks','quinns','tbonegraves','wywy']
        pos = 0
        if len(sys.argv) > 3:
            print(len(sys.argv))
            toMessUp = sys.argv[1]
            timesMessUp = int(sys.argv[2])
            message = sys.argv[3]
        elif len(sys.argv) > 2:
            toMessUp = False
            timesMessUp = int(sys.argv[1])
            message = sys.argv[2]
        else:
            print('''
USAGE:
Pinpoint: bb WHO HOW_MANY MESSAGE
All Users: bb HOW_MANY MESSAGE''')
            exit()
        if message == "":
            message = "-"
        elif toMessUp == False:
            nameSet = False
            confirmation = input("hit any key to continue. > ")
            nameSet = True
            for count in range(123):
                name = names[pos] 
                for count in range(timesMessUp):
                    os.system("bux " + name + " 0 " + message) 
                    time.sleep(0.01)
                pos += 1
        else: 
            nameSet = False
            confirmation = input("hit any key to continue. > ")
            name = toMessUp
            nameSet = True
            for count in range(timesMessUp):
                os.system("bux " + toMessUp + " 0 " + message) 
                time.sleep(0.01)

    except KeyboardInterrupt:
        if nameSet == True:
            print(c.red + "You stopped the program on "+c.green + name+"'s"+c.red+" name."+ c.X)
            exit()
        else:
            print("dodged a bullet there Mr.!")
            exit()
