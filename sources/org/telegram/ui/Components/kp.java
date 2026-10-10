package org.telegram.ui.Components;

import org.telegram.ui.bb1;
public final class kp implements Runnable {
    public final int f28077a;
    public final cq f28078b;

    public kp(cq cqVar, int i10) {
        this.f28077a = i10;
        this.f28078b = cqVar;
    }

    @Override
    public final void run() {
        switch (this.f28077a) {
            case 0:
                this.f28078b.h.l();
                return;
            case 1:
                this.f28078b.u(true);
                return;
            case 2:
                cq cqVar = this.f28078b;
                org.telegram.ui.zn znVar = cqVar.v;
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(znVar.getMessagesController().getChat(Long.valueOf(-znVar.a())), true);
                ?? obj = new Object();
                obj.f21361a = true;
                d02.setResourceProvider(znVar.getResourceProvider());
                obj.f21363c = new vh(2);
                obj.d = new kp(cqVar, 3);
                obj.f21362b = new kp(cqVar, 4);
                obj.f21364e = true;
                cqVar.X = d02;
                znVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28078b.w();
                return;
            case 4:
                this.f28078b.X = null;
                return;
            case 5:
                this.f28078b.w();
                return;
            case 6:
                this.f28078b.X = null;
                return;
            default:
                cq cqVar2 = this.f28078b;
                cqVar2.U.f(cqVar2.G, true);
                return;
        }
    }
}
