package org.telegram.ui.Components;

import org.telegram.ui.sa1;
public final class wo implements Runnable {
    public final int f30109a;
    public final op f30110b;

    public wo(op opVar, int i10) {
        this.f30109a = i10;
        this.f30110b = opVar;
    }

    @Override
    public final void run() {
        switch (this.f30109a) {
            case 0:
                this.f30110b.h.l();
                return;
            case 1:
                this.f30110b.s(true);
                return;
            case 2:
                op opVar = this.f30110b;
                org.telegram.ui.wn wnVar = opVar.v;
                org.telegram.ui.ActionBar.m2 d02 = sa1.d0(wnVar.getMessagesController().getChat(Long.valueOf(-wnVar.a())), true);
                ?? obj = new Object();
                obj.f19582a = true;
                d02.setResourceProvider(wnVar.getResourceProvider());
                obj.f19584c = new th(2);
                obj.d = new wo(opVar, 3);
                obj.f19583b = new wo(opVar, 4);
                obj.e = true;
                opVar.X = d02;
                wnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f30110b.u();
                return;
            case 4:
                this.f30110b.X = null;
                return;
            case 5:
                this.f30110b.u();
                return;
            case 6:
                this.f30110b.X = null;
                return;
            default:
                op opVar2 = this.f30110b;
                opVar2.U.f(opVar2.G, true);
                return;
        }
    }
}
