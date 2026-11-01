package org.telegram.ui.Components;
public final class bv0 implements Runnable {
    public final int f24925a;
    public final dv0 f24926b;

    public bv0(dv0 dv0Var, int i10) {
        this.f24925a = i10;
        this.f24926b = dv0Var;
    }

    @Override
    public final void run() {
        switch (this.f24925a) {
            case 0:
                dv0 dv0Var = this.f24926b;
                dv0Var.V0 = false;
                if (!dv0Var.Y0 && dv0Var.W0) {
                    dv0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f24926b.V0 = false;
                return;
            case 2:
                dv0 dv0Var2 = this.f24926b;
                dv0Var2.Y0 = false;
                if (!dv0Var2.V0 && dv0Var2.W0) {
                    dv0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f24926b.Y0 = false;
                return;
        }
    }
}
