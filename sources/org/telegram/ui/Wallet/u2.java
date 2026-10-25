package org.telegram.ui.Wallet;
public final class u2 implements Runnable {
    public final int f37346a;
    public final y2 f37347b;

    public u2(y2 y2Var, int i10) {
        this.f37346a = i10;
        this.f37347b = y2Var;
    }

    @Override
    public final void run() {
        switch (this.f37346a) {
            case 0:
                y2 y2Var = this.f37347b;
                if (!y2Var.S && !y2Var.R) {
                    y2Var.a(1.0f);
                    return;
                }
                return;
            default:
                y2 y2Var2 = this.f37347b;
                if (!y2Var2.S && !y2Var2.R) {
                    ih.d.c(y2Var2.E, y2Var2.h);
                    y2Var2.F.d();
                    w5 w5Var = y2Var2.f37498r;
                    u2 u2Var = new u2(y2Var2, 0);
                    r5 r5Var = w5Var.f37435y;
                    if (r5Var != null) {
                        if (r5Var.f37165b != null) {
                            u2Var.run();
                            return;
                        } else {
                            r5Var.d = u2Var;
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
