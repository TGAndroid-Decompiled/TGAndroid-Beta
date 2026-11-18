package org.telegram.ui.Components;
public final class uo implements Runnable {
    public final int f40384a;
    public final lp f40385b;

    public uo(lp lpVar, int i7) {
        this.f40384a = i7;
        this.f40385b = lpVar;
    }

    @Override
    public final void run() {
        switch (this.f40384a) {
            case 0:
                this.f40385b.f37178r1.f();
                return;
            case 1:
                this.f40385b.L0(true);
                return;
            case 2:
                lp lpVar = this.f40385b;
                org.telegram.ui.bn bnVar = lpVar.f37182v1;
                org.telegram.ui.ActionBar.h2 g02 = org.telegram.ui.c51.g0(bnVar.getMessagesController().O0(Long.valueOf(-bnVar.a())), true);
                ?? obj = new Object();
                obj.f28923a = true;
                g02.setResourceProvider(bnVar.getResourceProvider());
                obj.f28925c = new me(4);
                obj.d = new uo(lpVar, 3);
                obj.f28924b = new uo(lpVar, 4);
                obj.f28926e = true;
                lpVar.R1 = g02;
                bnVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f40385b.P0();
                return;
            case 4:
                this.f40385b.R1 = null;
                return;
            case 5:
                this.f40385b.P0();
                return;
            case 6:
                this.f40385b.R1 = null;
                return;
            default:
                lp lpVar2 = this.f40385b;
                lpVar2.O1.c(lpVar2.A1);
                return;
        }
    }
}
