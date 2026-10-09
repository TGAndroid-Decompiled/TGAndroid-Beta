package org.telegram.ui.Components;

import org.telegram.ui.bb1;
public final class kp implements Runnable {
    public final int f28118a;
    public final cq f28119b;

    public kp(cq cqVar, int i10) {
        this.f28118a = i10;
        this.f28119b = cqVar;
    }

    @Override
    public final void run() {
        switch (this.f28118a) {
            case 0:
                this.f28119b.h.l();
                return;
            case 1:
                this.f28119b.u(true);
                return;
            case 2:
                cq cqVar = this.f28119b;
                org.telegram.ui.zn znVar = cqVar.v;
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(znVar.getMessagesController().getChat(Long.valueOf(-znVar.a())), true);
                ?? obj = new Object();
                obj.f21357a = true;
                d02.setResourceProvider(znVar.getResourceProvider());
                obj.f21359c = new vh(2);
                obj.d = new kp(cqVar, 3);
                obj.f21358b = new kp(cqVar, 4);
                obj.f21360e = true;
                cqVar.X = d02;
                znVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28119b.w();
                return;
            case 4:
                this.f28119b.X = null;
                return;
            case 5:
                this.f28119b.w();
                return;
            case 6:
                this.f28119b.X = null;
                return;
            default:
                cq cqVar2 = this.f28119b;
                cqVar2.U.f(cqVar2.G, true);
                return;
        }
    }
}
