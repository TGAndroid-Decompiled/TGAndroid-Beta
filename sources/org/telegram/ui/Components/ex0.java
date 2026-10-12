package org.telegram.ui.Components;
public final class ex0 implements Runnable {
    public final int f25800a;
    public final gx0 f25801b;

    public ex0(gx0 gx0Var, int i10) {
        this.f25800a = i10;
        this.f25801b = gx0Var;
    }

    @Override
    public final void run() {
        switch (this.f25800a) {
            case 0:
                gx0 gx0Var = this.f25801b;
                gx0Var.V0 = false;
                if (!gx0Var.Y0 && gx0Var.W0) {
                    gx0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f25801b.V0 = false;
                return;
            case 2:
                gx0 gx0Var2 = this.f25801b;
                gx0Var2.Y0 = false;
                if (!gx0Var2.V0 && gx0Var2.W0) {
                    gx0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f25801b.Y0 = false;
                return;
        }
    }
}
