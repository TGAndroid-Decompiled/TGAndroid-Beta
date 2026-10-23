package org.telegram.ui.Wallet;
public final class u2 implements Runnable {
    public final int f35288a;
    public final y2 f35289b;

    public u2(y2 y2Var, int i10) {
        this.f35288a = i10;
        this.f35289b = y2Var;
    }

    @Override
    public final void run() {
        switch (this.f35288a) {
            case 0:
                y2 y2Var = this.f35289b;
                if (!y2Var.S && !y2Var.R) {
                    y2Var.a(1.0f);
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f35289b;
                if (!y2Var2.S && !y2Var2.R) {
                    hh.d.c(y2Var2.E, y2Var2.h);
                    y2Var2.F.d();
                    x5 x5Var = y2Var2.f35436r;
                    u2 u2Var = new u2(y2Var2, 0);
                    s5 s5Var = x5Var.f35412y;
                    if (s5Var != null) {
                        if (s5Var.f35131b != null) {
                            u2Var.run();
                            return;
                        } else {
                            s5Var.d = u2Var;
                            return;
                        }
                    }
                    u2Var.run();
                    return;
                }
                return;
        }
    }
}
