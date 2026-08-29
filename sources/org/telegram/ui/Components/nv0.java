package org.telegram.ui.Components;
public final class nv0 implements Runnable {
    public final int f31155a;
    public final pv0 f31156b;

    public nv0(pv0 pv0Var, int i10) {
        this.f31155a = i10;
        this.f31156b = pv0Var;
    }

    @Override
    public final void run() {
        switch (this.f31155a) {
            case 0:
                pv0 pv0Var = this.f31156b;
                pv0Var.R0 = false;
                if (!pv0Var.U0 && pv0Var.S0) {
                    pv0Var.A(true);
                    return;
                }
                return;
            case 1:
                this.f31156b.R0 = false;
                return;
            case 2:
                pv0 pv0Var2 = this.f31156b;
                pv0Var2.U0 = false;
                if (!pv0Var2.R0 && pv0Var2.S0) {
                    pv0Var2.A(true);
                    return;
                }
                return;
            default:
                this.f31156b.U0 = false;
                return;
        }
    }
}
