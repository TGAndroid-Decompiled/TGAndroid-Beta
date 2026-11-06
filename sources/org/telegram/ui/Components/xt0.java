package org.telegram.ui.Components;
public final class xt0 implements Runnable {
    public final int f40417a;
    public final zt0 f40418b;

    public xt0(zt0 zt0Var, int i7) {
        this.f40417a = i7;
        this.f40418b = zt0Var;
    }

    @Override
    public final void run() {
        switch (this.f40417a) {
            case 0:
                zt0 zt0Var = this.f40418b;
                zt0Var.V0 = false;
                if (!zt0Var.Y0 && zt0Var.W0) {
                    zt0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f40418b.V0 = false;
                return;
            case 2:
                zt0 zt0Var2 = this.f40418b;
                zt0Var2.Y0 = false;
                if (!zt0Var2.V0 && zt0Var2.W0) {
                    zt0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f40418b.Y0 = false;
                return;
        }
    }
}
