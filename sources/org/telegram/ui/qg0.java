package org.telegram.ui;
public final class qg0 implements Runnable {
    public final int f39441a;
    public final ah0 f39442b;

    public qg0(ah0 ah0Var, int i10) {
        this.f39441a = i10;
        this.f39442b = ah0Var;
    }

    @Override
    public final void run() {
        switch (this.f39441a) {
            case 0:
                ah0 ah0Var = this.f39442b;
                gk0 gk0Var = ah0Var.f34215a;
                bh0 bh0Var = ah0Var.V;
                xg0 xg0Var = ah0Var.f34216b;
                if (xg0Var != null) {
                    if (bh0Var.f34548c0) {
                        gk0Var.clearFocus();
                        xg0Var.clearFocus();
                    } else if (gk0Var.length() != 0) {
                        xg0Var.requestFocus();
                        if (!ah0Var.R) {
                            xg0Var.setSelection(xg0Var.length());
                        }
                        bh0.T0(bh0Var, xg0Var);
                    } else {
                        gk0Var.requestFocus();
                        bh0.T0(bh0Var, gk0Var);
                    }
                }
                if (bh0Var.F == 0) {
                    ah0Var.s(false);
                    return;
                }
                return;
            case 1:
                ah0 ah0Var2 = this.f39442b;
                ah0Var2.postDelayed(new qg0(ah0Var2, 2), 200L);
                return;
            case 2:
                this.f39442b.h(null);
                return;
            case 3:
                this.f39442b.s(true);
                return;
            default:
                ah0 ah0Var3 = this.f39442b;
                bh0.T0(ah0Var3.V, ah0Var3.f34216b);
                return;
        }
    }
}
