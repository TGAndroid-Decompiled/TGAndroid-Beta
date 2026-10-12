package org.telegram.ui.Components;

import org.telegram.ui.db1;
public final class mp implements Runnable {
    public final int f28605a;
    public final eq f28606b;

    public mp(eq eqVar, int i10) {
        this.f28605a = i10;
        this.f28606b = eqVar;
    }

    @Override
    public final void run() {
        switch (this.f28605a) {
            case 0:
                this.f28606b.h.l();
                return;
            case 1:
                this.f28606b.u(true);
                return;
            case 2:
                eq eqVar = this.f28606b;
                org.telegram.ui.eo eoVar = eqVar.v;
                org.telegram.ui.ActionBar.m2 d02 = db1.d0(eoVar.getMessagesController().getChat(Long.valueOf(-eoVar.a())), true);
                ?? obj = new Object();
                obj.f21088a = true;
                d02.setResourceProvider(eoVar.getResourceProvider());
                obj.f21090c = new xh(2);
                obj.d = new mp(eqVar, 3);
                obj.f21089b = new mp(eqVar, 4);
                obj.f21091e = true;
                eqVar.X = d02;
                eoVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28606b.w();
                return;
            case 4:
                this.f28606b.X = null;
                return;
            case 5:
                this.f28606b.w();
                return;
            case 6:
                this.f28606b.X = null;
                return;
            default:
                eq eqVar2 = this.f28606b;
                eqVar2.U.f(eqVar2.G, true);
                return;
        }
    }
}
