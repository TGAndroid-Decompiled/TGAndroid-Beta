package org.telegram.ui;
public final class kg0 implements Runnable {
    public final int f39332a;
    public final ug0 f39333b;

    public kg0(ug0 ug0Var, int i10) {
        this.f39332a = i10;
        this.f39333b = ug0Var;
    }

    @Override
    public final void run() {
        switch (this.f39332a) {
            case 0:
                ug0 ug0Var = this.f39333b;
                ak0 ak0Var = ug0Var.f42552a;
                vg0 vg0Var = ug0Var.V;
                rg0 rg0Var = ug0Var.f42553b;
                if (rg0Var != null) {
                    if (vg0Var.f43016c0) {
                        ak0Var.clearFocus();
                        rg0Var.clearFocus();
                    } else if (ak0Var.length() != 0) {
                        rg0Var.requestFocus();
                        if (!ug0Var.R) {
                            rg0Var.setSelection(rg0Var.length());
                        }
                        vg0.T0(vg0Var, rg0Var);
                    } else {
                        ak0Var.requestFocus();
                        vg0.T0(vg0Var, ak0Var);
                    }
                }
                if (vg0Var.F == 0) {
                    ug0Var.s(false);
                    return;
                }
                return;
            case 1:
                ug0 ug0Var2 = this.f39333b;
                ug0Var2.postDelayed(new kg0(ug0Var2, 2), 200L);
                return;
            case 2:
                this.f39333b.h(null);
                return;
            case 3:
                this.f39333b.s(true);
                return;
            default:
                ug0 ug0Var3 = this.f39333b;
                vg0.T0(ug0Var3.V, ug0Var3.f42553b);
                return;
        }
    }
}
