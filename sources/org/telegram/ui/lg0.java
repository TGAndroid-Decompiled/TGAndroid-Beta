package org.telegram.ui;
public final class lg0 implements Runnable {
    public final int f34712a;
    public final wg0 f34713b;

    public lg0(wg0 wg0Var, int i10) {
        this.f34712a = i10;
        this.f34713b = wg0Var;
    }

    @Override
    public final void run() {
        switch (this.f34712a) {
            case 0:
                wg0 wg0Var = this.f34713b;
                ck0 ck0Var = wg0Var.f38179a;
                xg0 xg0Var = wg0Var.V;
                tg0 tg0Var = wg0Var.f38180b;
                if (tg0Var != null) {
                    if (xg0Var.f38722c0) {
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
                wg0 wg0Var2 = this.f34713b;
                wg0Var2.postDelayed(new lg0(wg0Var2, 2), 200L);
                return;
            case 2:
                this.f34713b.h(null);
                return;
            case 3:
                this.f34713b.u(true);
                return;
            default:
                wg0 wg0Var3 = this.f34713b;
                xg0.T0(wg0Var3.V, wg0Var3.f38180b);
                return;
        }
    }
}
