package org.telegram.ui.Components;
public final class zw0 implements Runnable {
    public final int f33725a;
    public final bx0 f33726b;

    public zw0(bx0 bx0Var, int i10) {
        this.f33725a = i10;
        this.f33726b = bx0Var;
    }

    @Override
    public final void run() {
        switch (this.f33725a) {
            case 0:
                bx0 bx0Var = this.f33726b;
                bx0Var.V0 = false;
                if (!bx0Var.Y0 && bx0Var.W0) {
                    bx0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f33726b.V0 = false;
                return;
            case 2:
                bx0 bx0Var2 = this.f33726b;
                bx0Var2.Y0 = false;
                if (!bx0Var2.V0 && bx0Var2.W0) {
                    bx0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f33726b.Y0 = false;
                return;
        }
    }
}
