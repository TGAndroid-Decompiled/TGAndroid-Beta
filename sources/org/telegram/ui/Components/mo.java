package org.telegram.ui.Components;
public final class mo implements Runnable {
    public final int f28522a;
    public final dp f28523b;

    public mo(dp dpVar, int i10) {
        this.f28522a = i10;
        this.f28523b = dpVar;
    }

    @Override
    public final void run() {
        switch (this.f28522a) {
            case 0:
                this.f28523b.f25543n1.f();
                return;
            case 1:
                this.f28523b.K0(true);
                return;
            case 2:
                dp dpVar = this.f28523b;
                org.telegram.ui.un unVar = dpVar.f25547r1;
                org.telegram.ui.ActionBar.k2 g02 = org.telegram.ui.s61.g0(unVar.getMessagesController().L0(Long.valueOf(-unVar.a())), true);
                ?? obj = new Object();
                obj.f20390a = true;
                g02.setResourceProvider(unVar.getResourceProvider());
                obj.f20392c = new org.telegram.messenger.sz(17);
                obj.d = new mo(dpVar, 3);
                obj.f20391b = new mo(dpVar, 4);
                obj.e = true;
                dpVar.N1 = g02;
                unVar.showAsSheet(g02, obj);
                return;
            case 3:
                this.f28523b.O0();
                return;
            case 4:
                this.f28523b.N1 = null;
                return;
            case 5:
                this.f28523b.O0();
                return;
            case 6:
                this.f28523b.N1 = null;
                return;
            default:
                dp dpVar2 = this.f28523b;
                dpVar2.K1.f(dpVar2.f25552w1, true);
                return;
        }
    }
}
