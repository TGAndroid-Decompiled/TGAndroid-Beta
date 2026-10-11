package org.telegram.ui.Components;

import org.telegram.ui.ab1;
public final class kp implements Runnable {
    public final int f28114a;
    public final cq f28115b;

    public kp(cq cqVar, int i10) {
        this.f28114a = i10;
        this.f28115b = cqVar;
    }

    @Override
    public final void run() {
        switch (this.f28114a) {
            case 0:
                this.f28115b.h.l();
                return;
            case 1:
                this.f28115b.u(true);
                return;
            case 2:
                cq cqVar = this.f28115b;
                org.telegram.ui.zn znVar = cqVar.v;
                org.telegram.ui.ActionBar.m2 d02 = ab1.d0(znVar.getMessagesController().getChat(Long.valueOf(-znVar.a())), true);
                ?? obj = new Object();
                obj.f21349a = true;
                d02.setResourceProvider(znVar.getResourceProvider());
                obj.f21351c = new vh(2);
                obj.d = new kp(cqVar, 3);
                obj.f21350b = new kp(cqVar, 4);
                obj.f21352e = true;
                cqVar.X = d02;
                znVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28115b.w();
                return;
            case 4:
                this.f28115b.X = null;
                return;
            case 5:
                this.f28115b.w();
                return;
            case 6:
                this.f28115b.X = null;
                return;
            default:
                cq cqVar2 = this.f28115b;
                cqVar2.U.f(cqVar2.G, true);
                return;
        }
    }
}
