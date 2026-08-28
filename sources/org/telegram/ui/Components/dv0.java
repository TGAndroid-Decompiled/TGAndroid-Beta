package org.telegram.ui.Components;
public final class dv0 implements Runnable {
    public final int f27824a;
    public final fv0 f27825b;

    public dv0(fv0 fv0Var, int i9) {
        this.f27824a = i9;
        this.f27825b = fv0Var;
    }

    @Override
    public final void run() {
        switch (this.f27824a) {
            case 0:
                fv0 fv0Var = this.f27825b;
                fv0Var.R0 = false;
                if (!fv0Var.U0 && fv0Var.S0) {
                    fv0Var.A(true);
                    return;
                }
                return;
            case 1:
                this.f27825b.R0 = false;
                return;
            case 2:
                fv0 fv0Var2 = this.f27825b;
                fv0Var2.U0 = false;
                if (!fv0Var2.R0 && fv0Var2.S0) {
                    fv0Var2.A(true);
                    return;
                }
                return;
            default:
                this.f27825b.U0 = false;
                return;
        }
    }
}
