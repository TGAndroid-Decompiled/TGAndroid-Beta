package org.telegram.ui.Components;

import org.telegram.ui.sa1;
public final class wo implements Runnable {
    public final int f30152a;
    public final op f30153b;

    public wo(op opVar, int i10) {
        this.f30152a = i10;
        this.f30153b = opVar;
    }

    @Override
    public final void run() {
        switch (this.f30152a) {
            case 0:
                this.f30153b.h.l();
                return;
            case 1:
                this.f30153b.s(true);
                return;
            case 2:
                op opVar = this.f30153b;
                org.telegram.ui.wn wnVar = opVar.v;
                org.telegram.ui.ActionBar.m2 d02 = sa1.d0(wnVar.getMessagesController().getChat(Long.valueOf(-wnVar.a())), true);
                ?? obj = new Object();
                obj.f19581a = true;
                d02.setResourceProvider(wnVar.getResourceProvider());
                obj.f19583c = new th(2);
                obj.d = new wo(opVar, 3);
                obj.f19582b = new wo(opVar, 4);
                obj.e = true;
                opVar.X = d02;
                wnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f30153b.u();
                return;
            case 4:
                this.f30153b.X = null;
                return;
            case 5:
                this.f30153b.u();
                return;
            case 6:
                this.f30153b.X = null;
                return;
            default:
                op opVar2 = this.f30153b;
                opVar2.U.f(opVar2.G, true);
                return;
        }
    }
}
