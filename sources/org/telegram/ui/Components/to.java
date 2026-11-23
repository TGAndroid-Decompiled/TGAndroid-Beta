package org.telegram.ui.Components;
public final class to implements Runnable {
    public final int f40112a;
    public final kp f40113b;

    public to(kp kpVar, int i7) {
        this.f40112a = i7;
        this.f40113b = kpVar;
    }

    @Override
    public final void run() {
        switch (this.f40112a) {
            case 0:
                this.f40113b.f36834r1.f();
                return;
            case 1:
                this.f40113b.L0(true);
                return;
            case 2:
                kp kpVar = this.f40113b;
                org.telegram.ui.bn bnVar = kpVar.f36838v1;
                org.telegram.ui.ActionBar.g2 g02 = org.telegram.ui.b51.g0(bnVar.getMessagesController().O0(Long.valueOf(-bnVar.a())), true);
                ?? obj = new Object();
                obj.f28948a = true;
                g02.setResourceProvider(bnVar.getResourceProvider());
                obj.f28950c = new ne(4);
                obj.d = new to(kpVar, 3);
                obj.f28949b = new to(kpVar, 4);
                obj.f28951e = true;
                kpVar.R1 = g02;
                bnVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f40113b.P0();
                return;
            case 4:
                this.f40113b.R1 = null;
                return;
            case 5:
                this.f40113b.P0();
                return;
            case 6:
                this.f40113b.R1 = null;
                return;
            default:
                kp kpVar2 = this.f40113b;
                kpVar2.O1.c(kpVar2.A1);
                return;
        }
    }
}
