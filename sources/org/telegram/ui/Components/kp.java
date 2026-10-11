package org.telegram.ui.Components;

import org.telegram.ui.ab1;
public final class kp implements Runnable {
    public final int f28052a;
    public final cq f28053b;

    public kp(cq cqVar, int i10) {
        this.f28052a = i10;
        this.f28053b = cqVar;
    }

    @Override
    public final void run() {
        switch (this.f28052a) {
            case 0:
                this.f28053b.h.l();
                return;
            case 1:
                this.f28053b.u(true);
                return;
            case 2:
                cq cqVar = this.f28053b;
                org.telegram.ui.zn znVar = cqVar.v;
                org.telegram.ui.ActionBar.m2 d02 = ab1.d0(znVar.getMessagesController().getChat(Long.valueOf(-znVar.a())), true);
                ?? obj = new Object();
                obj.f21313a = true;
                d02.setResourceProvider(znVar.getResourceProvider());
                obj.f21315c = new vh(2);
                obj.d = new kp(cqVar, 3);
                obj.f21314b = new kp(cqVar, 4);
                obj.f21316e = true;
                cqVar.X = d02;
                znVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28053b.w();
                return;
            case 4:
                this.f28053b.X = null;
                return;
            case 5:
                this.f28053b.w();
                return;
            case 6:
                this.f28053b.X = null;
                return;
            default:
                cq cqVar2 = this.f28053b;
                cqVar2.U.f(cqVar2.G, true);
                return;
        }
    }
}
