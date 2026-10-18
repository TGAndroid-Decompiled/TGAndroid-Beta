package org.telegram.ui.Wallet;
public final class u2 implements Runnable {
    public final int f34963a;
    public final z2 f34964b;

    public u2(z2 z2Var, int i10) {
        this.f34963a = i10;
        this.f34964b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f34963a) {
            case 0:
                z2 z2Var = this.f34964b;
                if (!z2Var.Q && !z2Var.P) {
                    z2Var.a(1.0f);
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f34964b;
                if (!z2Var2.Q && !z2Var2.P) {
                    hh.d.c(z2Var2.E, z2Var2.h);
                    z2Var2.F.d();
                    x5 x5Var = z2Var2.f35169r;
                    u2 u2Var = new u2(z2Var2, 0);
                    s5 s5Var = x5Var.f35103y;
                    if (s5Var != null) {
                        if (s5Var.f34818b != null) {
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
