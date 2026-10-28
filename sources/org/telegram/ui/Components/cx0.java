package org.telegram.ui.Components;
public final class cx0 implements Runnable {
    public final int f27270a;
    public final ex0 f27271b;

    public cx0(ex0 ex0Var, int i10) {
        this.f27270a = i10;
        this.f27271b = ex0Var;
    }

    @Override
    public final void run() {
        switch (this.f27270a) {
            case 0:
                ex0 ex0Var = this.f27271b;
                ex0Var.V0 = false;
                if (!ex0Var.Y0 && ex0Var.W0) {
                    ex0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f27271b.V0 = false;
                return;
            case 2:
                ex0 ex0Var2 = this.f27271b;
                ex0Var2.Y0 = false;
                if (!ex0Var2.V0 && ex0Var2.W0) {
                    ex0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f27271b.Y0 = false;
                return;
        }
    }
}
