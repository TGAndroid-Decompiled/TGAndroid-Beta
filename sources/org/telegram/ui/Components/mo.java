package org.telegram.ui.Components;
public final class mo implements Runnable {
    public final int f28563a;
    public final dp f28564b;

    public mo(dp dpVar, int i10) {
        this.f28563a = i10;
        this.f28564b = dpVar;
    }

    @Override
    public final void run() {
        switch (this.f28563a) {
            case 0:
                this.f28564b.f25487n1.f();
                return;
            case 1:
                this.f28564b.K0(true);
                return;
            case 2:
                dp dpVar = this.f28564b;
                org.telegram.ui.un unVar = dpVar.f25491r1;
                org.telegram.ui.ActionBar.k2 f02 = org.telegram.ui.u61.f0(unVar.getMessagesController().L0(Long.valueOf(-unVar.a())), true);
                ?? obj = new Object();
                obj.f20389a = true;
                f02.setResourceProvider(unVar.getResourceProvider());
                obj.f20391c = new org.telegram.messenger.rz(17);
                obj.d = new mo(dpVar, 3);
                obj.f20390b = new mo(dpVar, 4);
                obj.e = true;
                dpVar.N1 = f02;
                unVar.showAsSheet(f02, obj);
                return;
            case 3:
                this.f28564b.O0();
                return;
            case 4:
                this.f28564b.N1 = null;
                return;
            case 5:
                this.f28564b.O0();
                return;
            case 6:
                this.f28564b.N1 = null;
                return;
            default:
                dp dpVar2 = this.f28564b;
                dpVar2.K1.f(dpVar2.f25496w1, true);
                return;
        }
    }
}
