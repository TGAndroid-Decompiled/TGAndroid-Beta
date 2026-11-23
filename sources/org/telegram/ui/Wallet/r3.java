package org.telegram.ui.Wallet;
public final class r3 implements Runnable {
    public final int f44989a;
    public final x3 f44990b;

    public r3(x3 x3Var, int i7) {
        this.f44989a = i7;
        this.f44990b = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f44989a) {
            case 0:
                x3 x3Var = this.f44990b;
                if (!x3Var.T && !x3Var.S) {
                    ih.d.c(x3Var.F, x3Var.h);
                    x3Var.G.d();
                    y6 y6Var = x3Var.f45378r;
                    r3 r3Var = new r3(x3Var, 1);
                    t6 t6Var = y6Var.E;
                    if (t6Var != null) {
                        if (t6Var.f45168b != null) {
                            r3Var.run();
                            return;
                        } else {
                            t6Var.d = r3Var;
                            return;
                        }
                    }
                    r3Var.run();
                    return;
                }
                return;
            default:
                x3 x3Var2 = this.f44990b;
                if (!x3Var2.T && !x3Var2.S) {
                    x3Var2.a(1.0f);
                    return;
                }
                return;
        }
    }
}
