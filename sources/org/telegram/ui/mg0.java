package org.telegram.ui;
public final class mg0 implements Runnable {
    public final int f40040a;
    public final wg0 f40041b;

    public mg0(wg0 wg0Var, int i10) {
        this.f40040a = i10;
        this.f40041b = wg0Var;
    }

    @Override
    public final void run() {
        switch (this.f40040a) {
            case 0:
                wg0 wg0Var = this.f40041b;
                ck0 ck0Var = wg0Var.f43517a;
                xg0 xg0Var = wg0Var.V;
                tg0 tg0Var = wg0Var.f43518b;
                if (tg0Var != null) {
                    if (xg0Var.f43942c0) {
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
                    wg0Var.s(false);
                    return;
                }
                return;
            case 1:
                wg0 wg0Var2 = this.f40041b;
                wg0Var2.postDelayed(new mg0(wg0Var2, 2), 200L);
                return;
            case 2:
                this.f40041b.h(null);
                return;
            case 3:
                this.f40041b.s(true);
                return;
            default:
                wg0 wg0Var3 = this.f40041b;
                xg0.T0(wg0Var3.V, wg0Var3.f43518b);
                return;
        }
    }
}
