package org.telegram.ui;
public final class ng0 implements Runnable {
    public final int f36106a;
    public final xg0 f36107b;

    public ng0(xg0 xg0Var, int i10) {
        this.f36106a = i10;
        this.f36107b = xg0Var;
    }

    @Override
    public final void run() {
        switch (this.f36106a) {
            case 0:
                xg0 xg0Var = this.f36107b;
                ck0 ck0Var = xg0Var.f39619a;
                yg0 yg0Var = xg0Var.V;
                ug0 ug0Var = xg0Var.f39620b;
                if (ug0Var != null) {
                    if (yg0Var.f39893c0) {
                        ck0Var.clearFocus();
                        ug0Var.clearFocus();
                    } else if (ck0Var.length() != 0) {
                        ug0Var.requestFocus();
                        if (!xg0Var.R) {
                            ug0Var.setSelection(ug0Var.length());
                        }
                        yg0.T0(yg0Var, ug0Var);
                    } else {
                        ck0Var.requestFocus();
                        yg0.T0(yg0Var, ck0Var);
                    }
                }
                if (yg0Var.F == 0) {
                    xg0Var.u(false);
                    return;
                }
                return;
            case 1:
                xg0 xg0Var2 = this.f36107b;
                xg0Var2.postDelayed(new ng0(xg0Var2, 2), 200L);
                return;
            case 2:
                this.f36107b.h(null);
                return;
            case 3:
                this.f36107b.u(true);
                return;
            default:
                xg0 xg0Var3 = this.f36107b;
                yg0.T0(xg0Var3.V, xg0Var3.f39620b);
                return;
        }
    }
}
