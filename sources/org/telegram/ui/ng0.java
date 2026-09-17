package org.telegram.ui;
public final class ng0 implements Runnable {
    public final int f36101a;
    public final xg0 f36102b;

    public ng0(xg0 xg0Var, int i10) {
        this.f36101a = i10;
        this.f36102b = xg0Var;
    }

    @Override
    public final void run() {
        switch (this.f36101a) {
            case 0:
                xg0 xg0Var = this.f36102b;
                ck0 ck0Var = xg0Var.f39614a;
                yg0 yg0Var = xg0Var.V;
                ug0 ug0Var = xg0Var.f39615b;
                if (ug0Var != null) {
                    if (yg0Var.f39888c0) {
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
                xg0 xg0Var2 = this.f36102b;
                xg0Var2.postDelayed(new ng0(xg0Var2, 2), 200L);
                return;
            case 2:
                this.f36102b.h(null);
                return;
            case 3:
                this.f36102b.u(true);
                return;
            default:
                xg0 xg0Var3 = this.f36102b;
                yg0.T0(xg0Var3.V, xg0Var3.f39615b);
                return;
        }
    }
}
