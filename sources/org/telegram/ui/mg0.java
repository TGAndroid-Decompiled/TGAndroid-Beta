package org.telegram.ui;
public final class mg0 implements Runnable {
    public final int f35663a;
    public final wg0 f35664b;

    public mg0(wg0 wg0Var, int i10) {
        this.f35663a = i10;
        this.f35664b = wg0Var;
    }

    @Override
    public final void run() {
        switch (this.f35663a) {
            case 0:
                wg0 wg0Var = this.f35664b;
                ck0 ck0Var = wg0Var.f39146a;
                xg0 xg0Var = wg0Var.V;
                tg0 tg0Var = wg0Var.f39147b;
                if (tg0Var != null) {
                    if (xg0Var.f39466c0) {
                        ck0Var.clearFocus();
                        tg0Var.clearFocus();
                    } else if (ck0Var.length() != 0) {
                        tg0Var.requestFocus();
                        if (!wg0Var.R) {
                            tg0Var.setSelection(tg0Var.length());
                        }
                        xg0.T0(xg0Var, tg0Var);
                    } else {
                        ck0Var.requestFocus();
                        xg0.T0(xg0Var, ck0Var);
                    }
                }
                if (xg0Var.F == 0) {
                    wg0Var.u(false);
                    return;
                }
                return;
            case 1:
                wg0 wg0Var2 = this.f35664b;
                wg0Var2.postDelayed(new mg0(wg0Var2, 2), 200L);
                return;
            case 2:
                this.f35664b.h(null);
                return;
            case 3:
                this.f35664b.u(true);
                return;
            default:
                wg0 wg0Var3 = this.f35664b;
                xg0.T0(wg0Var3.V, wg0Var3.f39147b);
                return;
        }
    }
}
