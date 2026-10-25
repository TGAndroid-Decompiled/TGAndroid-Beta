package org.telegram.ui.Components;
public final class gp implements Runnable {
    public final int f28662a;
    public final yp f28663b;

    public gp(yp ypVar, int i10) {
        this.f28662a = i10;
        this.f28663b = ypVar;
    }

    @Override
    public final void run() {
        switch (this.f28662a) {
            case 0:
                this.f28663b.h.l();
                return;
            case 1:
                this.f28663b.u(true);
                return;
            case 2:
                yp ypVar = this.f28663b;
                org.telegram.ui.un unVar = ypVar.v;
                org.telegram.ui.ActionBar.r2 c02 = org.telegram.ui.w91.c0(unVar.getMessagesController().getChat(Long.valueOf(-unVar.a())), true);
                ?? obj = new Object();
                obj.f22926a = true;
                c02.setResourceProvider(unVar.getResourceProvider());
                obj.f22928c = new k5(9);
                obj.d = new gp(ypVar, 3);
                obj.f22927b = new gp(ypVar, 4);
                obj.e = true;
                ypVar.W = c02;
                unVar.showAsSheet(c02, obj);
                return;
            case 3:
                this.f28663b.y();
                return;
            case 4:
                this.f28663b.W = null;
                return;
            case 5:
                this.f28663b.y();
                return;
            case 6:
                this.f28663b.W = null;
                return;
            default:
                yp ypVar2 = this.f28663b;
                ypVar2.T.f(ypVar2.F, true);
                return;
        }
    }
}
