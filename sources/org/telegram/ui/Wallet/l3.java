package org.telegram.ui.Wallet;
public final class l3 implements Runnable {
    public final int f42733a;
    public final p3 f42734b;

    public l3(p3 p3Var, int i7) {
        this.f42733a = i7;
        this.f42734b = p3Var;
    }

    @Override
    public final void run() {
        switch (this.f42733a) {
            case 0:
                p3 p3Var = this.f42734b;
                if (!p3Var.S && !p3Var.R) {
                    p3Var.a(1.0f);
                    return;
                }
                return;
            default:
                p3 p3Var2 = this.f42734b;
                if (!p3Var2.S && !p3Var2.R) {
                    ih.d.c(p3Var2.E, p3Var2.h);
                    p3Var2.F.d();
                    h6 h6Var = p3Var2.f42986r;
                    l3 l3Var = new l3(p3Var2, 0);
                    c6 c6Var = h6Var.D;
                    if (c6Var != null) {
                        if (c6Var.f42227b != null) {
                            l3Var.run();
                            return;
                        } else {
                            c6Var.d = l3Var;
                            return;
                        }
                    }
                    l3Var.run();
                    return;
                }
                return;
        }
    }
}
