package org.telegram.ui.Components;
public final class zt0 implements Runnable {
    public final int f41136a;
    public final bu0 f41137b;

    public zt0(bu0 bu0Var, int i7) {
        this.f41136a = i7;
        this.f41137b = bu0Var;
    }

    @Override
    public final void run() {
        switch (this.f41136a) {
            case 0:
                bu0 bu0Var = this.f41137b;
                bu0Var.V0 = false;
                if (!bu0Var.Y0 && bu0Var.W0) {
                    bu0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f41137b.V0 = false;
                return;
            case 2:
                bu0 bu0Var2 = this.f41137b;
                bu0Var2.Y0 = false;
                if (!bu0Var2.V0 && bu0Var2.W0) {
                    bu0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f41137b.Y0 = false;
                return;
        }
    }
}
