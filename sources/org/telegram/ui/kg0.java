package org.telegram.ui;
public final class kg0 implements Runnable {
    public final int f39366a;
    public final ug0 f39367b;

    public kg0(ug0 ug0Var, int i10) {
        this.f39366a = i10;
        this.f39367b = ug0Var;
    }

    @Override
    public final void run() {
        switch (this.f39366a) {
            case 0:
                ug0 ug0Var = this.f39367b;
                ak0 ak0Var = ug0Var.f42586a;
                vg0 vg0Var = ug0Var.V;
                rg0 rg0Var = ug0Var.f42587b;
                if (rg0Var != null) {
                    if (vg0Var.f43050c0) {
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
                ug0 ug0Var2 = this.f39367b;
                ug0Var2.postDelayed(new kg0(ug0Var2, 2), 200L);
                return;
            case 2:
                this.f39367b.h(null);
                return;
            case 3:
                this.f39367b.s(true);
                return;
            default:
                ug0 ug0Var3 = this.f39367b;
                vg0.T0(ug0Var3.V, ug0Var3.f42587b);
                return;
        }
    }
}
