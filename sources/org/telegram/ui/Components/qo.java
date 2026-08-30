package org.telegram.ui.Components;

import org.telegram.ui.ga1;
public final class qo implements Runnable {
    public final int f28200a;
    public final kp f28201b;

    public qo(kp kpVar, int i10) {
        this.f28200a = i10;
        this.f28201b = kpVar;
    }

    @Override
    public final void run() {
        switch (this.f28200a) {
            case 0:
                this.f28201b.h.l();
                return;
            case 1:
                this.f28201b.s(true);
                return;
            case 2:
                kp kpVar = this.f28201b;
                org.telegram.ui.xn xnVar = kpVar.v;
                org.telegram.ui.ActionBar.p2 d02 = ga1.d0(xnVar.getMessagesController().getChat(Long.valueOf(-xnVar.a())), true);
                ?? obj = new Object();
                obj.f20478a = true;
                d02.setResourceProvider(xnVar.getResourceProvider());
                obj.f20480c = new mc(5);
                obj.d = new qo(kpVar, 3);
                obj.f20479b = new qo(kpVar, 4);
                obj.e = true;
                kpVar.U = d02;
                xnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f28201b.u();
                return;
            case 4:
                this.f28201b.U = null;
                return;
            case 5:
                this.f28201b.u();
                return;
            case 6:
                this.f28201b.U = null;
                return;
            default:
                kp kpVar2 = this.f28201b;
                kpVar2.R.f(kpVar2.D, true);
                return;
        }
    }
}
