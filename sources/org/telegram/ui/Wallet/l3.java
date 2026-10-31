package org.telegram.ui.Wallet;
public final class l3 implements Runnable {
    public final int f34836a;
    public final p3 f34837b;

    public l3(p3 p3Var, int i10) {
        this.f34836a = i10;
        this.f34837b = p3Var;
    }

    @Override
    public final void run() {
        switch (this.f34836a) {
            case 0:
                p3 p3Var = this.f34837b;
                if (!p3Var.S && !p3Var.R) {
                    p3Var.a(1.0f);
                    return;
                }
                return;
            default:
                p3 p3Var2 = this.f34837b;
                if (!p3Var2.S && !p3Var2.R) {
                    yg.d.c(p3Var2.E, p3Var2.h);
                    p3Var2.F.d();
                    l6 l6Var = p3Var2.f35022r;
                    l3 l3Var = new l3(p3Var2, 0);
                    g6 g6Var = l6Var.D;
                    if (g6Var != null) {
                        if (g6Var.f34554b != null) {
                            l3Var.run();
                            return;
                        } else {
                            g6Var.d = l3Var;
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
