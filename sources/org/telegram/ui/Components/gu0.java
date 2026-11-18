package org.telegram.ui.Components;
public final class gu0 implements Runnable {
    public final int f35658a;
    public final iu0 f35659b;

    public gu0(iu0 iu0Var, int i7) {
        this.f35658a = i7;
        this.f35659b = iu0Var;
    }

    @Override
    public final void run() {
        switch (this.f35658a) {
            case 0:
                iu0 iu0Var = this.f35659b;
                iu0Var.W0 = false;
                if (!iu0Var.Z0 && iu0Var.X0) {
                    iu0Var.C(true);
                    return;
                }
                return;
            case 1:
                this.f35659b.W0 = false;
                return;
            case 2:
                iu0 iu0Var2 = this.f35659b;
                iu0Var2.Z0 = false;
                if (!iu0Var2.W0 && iu0Var2.X0) {
                    iu0Var2.C(true);
                    return;
                }
                return;
            default:
                this.f35659b.Z0 = false;
                return;
        }
    }
}
