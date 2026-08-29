package org.telegram.ui.Components;

import org.telegram.ui.t91;
public final class oo implements Runnable {
    public final int f31440a;
    public final gp f31441b;

    public oo(gp gpVar, int i10) {
        this.f31440a = i10;
        this.f31441b = gpVar;
    }

    @Override
    public final void run() {
        switch (this.f31440a) {
            case 0:
                this.f31441b.h.l();
                return;
            case 1:
                this.f31441b.s(true);
                return;
            case 2:
                gp gpVar = this.f31441b;
                org.telegram.ui.tn tnVar = gpVar.v;
                org.telegram.ui.ActionBar.o2 d02 = t91.d0(tnVar.getMessagesController().getChat(Long.valueOf(-tnVar.a())), true);
                ?? obj = new Object();
                obj.f23673a = true;
                d02.setResourceProvider(tnVar.getResourceProvider());
                obj.f23675c = new g5(9);
                obj.d = new oo(gpVar, 3);
                obj.f23674b = new oo(gpVar, 4);
                obj.f23676e = true;
                gpVar.T = d02;
                tnVar.showAsSheet(d02, obj);
                return;
            case 3:
                this.f31441b.u();
                return;
            case 4:
                this.f31441b.T = null;
                return;
            case 5:
                this.f31441b.u();
                return;
            case 6:
                this.f31441b.T = null;
                return;
            default:
                gp gpVar2 = this.f31441b;
                gpVar2.Q.f(gpVar2.C, true);
                return;
        }
    }
}
