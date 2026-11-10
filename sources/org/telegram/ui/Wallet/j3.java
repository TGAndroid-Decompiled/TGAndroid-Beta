package org.telegram.ui.Wallet;
public final class j3 implements Runnable {
    public final int f42674a;
    public final p3 f42675b;

    public j3(p3 p3Var, int i7) {
        this.f42674a = i7;
        this.f42675b = p3Var;
    }

    @Override
    public final void run() {
        switch (this.f42674a) {
            case 0:
                p3 p3Var = this.f42675b;
                if (!p3Var.S && !p3Var.R) {
                    ih.d.c(p3Var.E, p3Var.h);
                    p3Var.F.d();
                    i6 i6Var = p3Var.f42971r;
                    j3 j3Var = new j3(p3Var, 1);
                    d6 d6Var = i6Var.D;
                    if (d6Var != null) {
                        if (d6Var.f42352b != null) {
                            j3Var.run();
                            return;
                        } else {
                            d6Var.d = j3Var;
                            return;
                        }
                    }
                    j3Var.run();
                    return;
                }
                return;
            default:
                p3 p3Var2 = this.f42675b;
                if (!p3Var2.S && !p3Var2.R) {
                    p3Var2.a(1.0f);
                    return;
                }
                return;
        }
    }
}
