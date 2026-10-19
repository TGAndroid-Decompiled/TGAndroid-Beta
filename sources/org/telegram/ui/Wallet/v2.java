package org.telegram.ui.Wallet;
public final class v2 implements Runnable {
    public final int f35006a;
    public final z2 f35007b;

    public v2(z2 z2Var, int i10) {
        this.f35006a = i10;
        this.f35007b = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f35006a) {
            case 0:
                z2 z2Var = this.f35007b;
                if (!z2Var.S && !z2Var.R) {
                    z2Var.a(1.0f);
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f35007b;
                if (!z2Var2.S && !z2Var2.R) {
                    hh.d.c(z2Var2.E, z2Var2.h);
                    z2Var2.F.d();
                    x5 x5Var = z2Var2.f35165r;
                    v2 v2Var = new v2(z2Var2, 0);
                    s5 s5Var = x5Var.f35106y;
                    if (s5Var != null) {
                        if (s5Var.f34834b != null) {
                            v2Var.run();
                            return;
                        } else {
                            s5Var.d = v2Var;
                            return;
                        }
                    }
                    v2Var.run();
                    return;
                }
                return;
        }
    }
}
