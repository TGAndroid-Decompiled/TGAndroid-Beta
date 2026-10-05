package org.telegram.ui.Components;
public final class sw0 implements Runnable {
    public final int f30954a;
    public final uw0 f30955b;

    public sw0(uw0 uw0Var, int i10) {
        this.f30954a = i10;
        this.f30955b = uw0Var;
    }

    @Override
    public final void run() {
        switch (this.f30954a) {
            case 0:
                uw0 uw0Var = this.f30955b;
                uw0Var.V0 = false;
                if (!uw0Var.Y0 && uw0Var.W0) {
                    uw0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f30955b.V0 = false;
                return;
            case 2:
                uw0 uw0Var2 = this.f30955b;
                uw0Var2.Y0 = false;
                if (!uw0Var2.V0 && uw0Var2.W0) {
                    uw0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f30955b.Y0 = false;
                return;
        }
    }
}
