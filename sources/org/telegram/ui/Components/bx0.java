package org.telegram.ui.Components;
public final class bx0 implements Runnable {
    public final int f26976a;
    public final dx0 f26977b;

    public bx0(dx0 dx0Var, int i10) {
        this.f26976a = i10;
        this.f26977b = dx0Var;
    }

    @Override
    public final void run() {
        switch (this.f26976a) {
            case 0:
                dx0 dx0Var = this.f26977b;
                dx0Var.V0 = false;
                if (!dx0Var.Y0 && dx0Var.W0) {
                    dx0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f26977b.V0 = false;
                return;
            case 2:
                dx0 dx0Var2 = this.f26977b;
                dx0Var2.Y0 = false;
                if (!dx0Var2.V0 && dx0Var2.W0) {
                    dx0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f26977b.Y0 = false;
                return;
        }
    }
}
