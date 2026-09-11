package org.telegram.ui.Components;

import org.telegram.ui.bb1;
public final class to implements Runnable {
    public final int f30668a;
    public final lp f30669b;

    public to(lp lpVar, int i10) {
        this.f30668a = i10;
        this.f30669b = lpVar;
    }

    @Override
    public final void run() {
        switch (this.f30668a) {
            case 0:
                this.f30669b.h.l();
                return;
            case 1:
                this.f30669b.s(true);
                return;
            case 2:
                lp lpVar = this.f30669b;
                org.telegram.ui.co coVar = lpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(coVar.getMessagesController().getChat(Long.valueOf(-coVar.a())), true);
                ?? obj = new Object();
                obj.f21142a = true;
                d02.setResourceProvider(coVar.getResourceProvider());
                obj.f21144c = new ue(3);
                obj.d = new to(lpVar, 3);
                obj.f21143b = new to(lpVar, 4);
                obj.f21145e = true;
                lpVar.X = d02;
                coVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f30669b.u();
                return;
            case 4:
                this.f30669b.X = null;
                return;
            case 5:
                this.f30669b.u();
                return;
            case 6:
                this.f30669b.X = null;
                return;
            default:
                lp lpVar2 = this.f30669b;
                lpVar2.U.f(lpVar2.G, true);
                return;
        }
    }
}
