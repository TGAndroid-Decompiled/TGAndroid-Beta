package org.telegram.ui.Components;
public final class bx0 implements Runnable {
    public final int f26978a;
    public final dx0 f26979b;

    public bx0(dx0 dx0Var, int i10) {
        this.f26978a = i10;
        this.f26979b = dx0Var;
    }

    @Override
    public final void run() {
        switch (this.f26978a) {
            case 0:
                dx0 dx0Var = this.f26979b;
                dx0Var.V0 = false;
                if (!dx0Var.Y0 && dx0Var.W0) {
                    dx0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f26979b.V0 = false;
                return;
            case 2:
                dx0 dx0Var2 = this.f26979b;
                dx0Var2.Y0 = false;
                if (!dx0Var2.V0 && dx0Var2.W0) {
                    dx0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f26979b.Y0 = false;
                return;
        }
    }
}
