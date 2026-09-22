package org.telegram.ui;
public final class ng0 implements Runnable {
    public final int f36041a;
    public final xg0 f36042b;

    public ng0(xg0 xg0Var, int i10) {
        this.f36041a = i10;
        this.f36042b = xg0Var;
    }

    @Override
    public final void run() {
        switch (this.f36041a) {
            case 0:
                xg0 xg0Var = this.f36042b;
                dk0 dk0Var = xg0Var.f39584a;
                yg0 yg0Var = xg0Var.V;
                ug0 ug0Var = xg0Var.f39585b;
                if (ug0Var != null) {
                    if (yg0Var.f39934c0) {
                        dk0Var.clearFocus();
                        ug0Var.clearFocus();
                    } else if (dk0Var.length() != 0) {
                        ug0Var.requestFocus();
                        if (!xg0Var.R) {
                            ug0Var.setSelection(ug0Var.length());
                        }
                        yg0.T0(yg0Var, ug0Var);
                    } else {
                        dk0Var.requestFocus();
                        yg0.T0(yg0Var, dk0Var);
                    }
                }
                if (yg0Var.F == 0) {
                    xg0Var.u(false);
                    return;
                }
                return;
            case 1:
                xg0 xg0Var2 = this.f36042b;
                xg0Var2.postDelayed(new ng0(xg0Var2, 2), 200L);
                return;
            case 2:
                this.f36042b.h(null);
                return;
            case 3:
                this.f36042b.u(true);
                return;
            default:
                xg0 xg0Var3 = this.f36042b;
                yg0.T0(xg0Var3.V, xg0Var3.f39585b);
                return;
        }
    }
}
