package org.telegram.ui.Components;

public final class fv0 implements Runnable {

    public final int f28460a;

    public final hv0 f28461b;

    public fv0(hv0 hv0Var, int i10) {
        this.f28460a = i10;
        this.f28461b = hv0Var;
    }

    @Override
    public final void run() {
        switch (this.f28460a) {
            case 0:
                hv0 hv0Var = this.f28461b;
                hv0Var.R0 = false;
                if (!hv0Var.U0 && hv0Var.S0) {
                    hv0Var.A(true);
                    break;
                }
                break;
            case 1:
                this.f28461b.R0 = false;
                break;
            case 2:
                hv0 hv0Var2 = this.f28461b;
                hv0Var2.U0 = false;
                if (!hv0Var2.R0 && hv0Var2.S0) {
                    hv0Var2.A(true);
                    break;
                }
                break;
            default:
                this.f28461b.U0 = false;
                break;
        }
    }
}
