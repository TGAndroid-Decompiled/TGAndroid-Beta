package org.telegram.ui.Components;

import org.telegram.ui.bb1;
public final class to implements Runnable {
    public final int f30669a;
    public final lp f30670b;

    public to(lp lpVar, int i10) {
        this.f30669a = i10;
        this.f30670b = lpVar;
    }

    @Override
    public final void run() {
        switch (this.f30669a) {
            case 0:
                this.f30670b.h.l();
                return;
            case 1:
                this.f30670b.s(true);
                return;
            case 2:
                lp lpVar = this.f30670b;
                org.telegram.ui.co coVar = lpVar.v;
                org.telegram.ui.ActionBar.n2 d02 = bb1.d0(coVar.getMessagesController().getChat(Long.valueOf(-coVar.a())), true);
                ?? obj = new Object();
                obj.f21143a = true;
                d02.setResourceProvider(coVar.getResourceProvider());
                obj.f21145c = new ue(3);
                obj.d = new to(lpVar, 3);
                obj.f21144b = new to(lpVar, 4);
                obj.f21146e = true;
                lpVar.X = d02;
                coVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f30670b.u();
                return;
            case 4:
                this.f30670b.X = null;
                return;
            case 5:
                this.f30670b.u();
                return;
            case 6:
                this.f30670b.X = null;
                return;
            default:
                lp lpVar2 = this.f30670b;
                lpVar2.U.f(lpVar2.G, true);
                return;
        }
    }
}
