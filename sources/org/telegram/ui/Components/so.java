package org.telegram.ui.Components;

import org.telegram.ui.na1;
public final class so implements Runnable {
    public final int f31143a;
    public final mp f31144b;

    public so(mp mpVar, int i10) {
        this.f31143a = i10;
        this.f31144b = mpVar;
    }

    @Override
    public final void run() {
        switch (this.f31143a) {
            case 0:
                this.f31144b.h.l();
                return;
            case 1:
                this.f31144b.s(true);
                return;
            case 2:
                mp mpVar = this.f31144b;
                org.telegram.ui.xn xnVar = mpVar.v;
                org.telegram.ui.ActionBar.p2 d02 = na1.d0(xnVar.getMessagesController().getChat(Long.valueOf(-xnVar.a())), true);
                ?? obj = new Object();
                obj.f22158a = true;
                d02.setResourceProvider(xnVar.getResourceProvider());
                obj.f22160c = new jc(7);
                obj.d = new so(mpVar, 3);
                obj.f22159b = new so(mpVar, 4);
                obj.f22161e = true;
                mpVar.U = d02;
                xnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f31144b.u();
                return;
            case 4:
                this.f31144b.U = null;
                return;
            case 5:
                this.f31144b.u();
                return;
            case 6:
                this.f31144b.U = null;
                return;
            default:
                mp mpVar2 = this.f31144b;
                mpVar2.R.f(mpVar2.D, true);
                return;
        }
    }
}
