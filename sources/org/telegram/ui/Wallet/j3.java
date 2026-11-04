package org.telegram.ui.Wallet;
public final class j3 implements Runnable {
    public final int f42699a;
    public final n3 f42700b;

    public j3(n3 n3Var, int i3) {
        this.f42699a = i3;
        this.f42700b = n3Var;
    }

    @Override
    public final void run() {
        switch (this.f42699a) {
            case 0:
                n3 n3Var = this.f42700b;
                if (!n3Var.T && !n3Var.S) {
                    n3Var.a(1.0f);
                    return;
                }
                return;
            default:
                n3 n3Var2 = this.f42700b;
                if (!n3Var2.T && !n3Var2.S) {
                    jh.d.c(n3Var2.F, n3Var2.h);
                    n3Var2.G.d();
                    f6 f6Var = n3Var2.f42919r;
                    j3 j3Var = new j3(n3Var2, 0);
                    a6 a6Var = f6Var.E;
                    if (a6Var != null) {
                        if (a6Var.f42138b != null) {
                            j3Var.run();
                            return;
                        } else {
                            a6Var.d = j3Var;
                            return;
                        }
                    }
                    j3Var.run();
                    return;
                }
                return;
        }
    }
}
