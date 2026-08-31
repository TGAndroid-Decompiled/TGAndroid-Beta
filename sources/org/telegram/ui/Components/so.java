package org.telegram.ui.Components;

import org.telegram.ui.ha1;
public final class so implements Runnable {
    public final int f31135a;
    public final mp f31136b;

    public so(mp mpVar, int i10) {
        this.f31135a = i10;
        this.f31136b = mpVar;
    }

    @Override
    public final void run() {
        switch (this.f31135a) {
            case 0:
                this.f31136b.h.l();
                return;
            case 1:
                this.f31136b.s(true);
                return;
            case 2:
                mp mpVar = this.f31136b;
                org.telegram.ui.xn xnVar = mpVar.v;
                org.telegram.ui.ActionBar.p2 d02 = ha1.d0(xnVar.getMessagesController().getChat(Long.valueOf(-xnVar.a())), true);
                ?? obj = new Object();
                obj.f22156a = true;
                d02.setResourceProvider(xnVar.getResourceProvider());
                obj.f22158c = new jc(7);
                obj.d = new so(mpVar, 3);
                obj.f22157b = new so(mpVar, 4);
                obj.f22159e = true;
                mpVar.U = d02;
                xnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f31136b.u();
                return;
            case 4:
                this.f31136b.U = null;
                return;
            case 5:
                this.f31136b.u();
                return;
            case 6:
                this.f31136b.U = null;
                return;
            default:
                mp mpVar2 = this.f31136b;
                mpVar2.R.f(mpVar2.D, true);
                return;
        }
    }
}
