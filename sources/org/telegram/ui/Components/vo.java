package org.telegram.ui.Components;

import org.telegram.ui.ra1;
public final class vo implements Runnable {
    public final int f28819a;
    public final np f28820b;

    public vo(np npVar, int i10) {
        this.f28819a = i10;
        this.f28820b = npVar;
    }

    @Override
    public final void run() {
        switch (this.f28819a) {
            case 0:
                this.f28820b.h.l();
                return;
            case 1:
                this.f28820b.s(true);
                return;
            case 2:
                np npVar = this.f28820b;
                org.telegram.ui.xn xnVar = npVar.v;
                org.telegram.ui.ActionBar.n2 d02 = ra1.d0(xnVar.getMessagesController().getChat(Long.valueOf(-xnVar.a())), true);
                ?? obj = new Object();
                obj.f19352a = true;
                d02.setResourceProvider(xnVar.getResourceProvider());
                obj.f19354c = new th(2);
                obj.d = new vo(npVar, 3);
                obj.f19353b = new vo(npVar, 4);
                obj.e = true;
                npVar.X = d02;
                xnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28820b.u();
                return;
            case 4:
                this.f28820b.X = null;
                return;
            case 5:
                this.f28820b.u();
                return;
            case 6:
                this.f28820b.X = null;
                return;
            default:
                np npVar2 = this.f28820b;
                npVar2.U.f(npVar2.G, true);
                return;
        }
    }
}
