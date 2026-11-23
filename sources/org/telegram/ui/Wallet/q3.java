package org.telegram.ui.Wallet;
public final class q3 implements Runnable {
    public final int f44861a;
    public final w3 f44862b;

    public q3(w3 w3Var, int i7) {
        this.f44861a = i7;
        this.f44862b = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f44861a) {
            case 0:
                w3 w3Var = this.f44862b;
                if (!w3Var.T && !w3Var.S) {
                    ih.d.c(w3Var.F, w3Var.h);
                    w3Var.G.d();
                    x6 x6Var = w3Var.f45251r;
                    q3 q3Var = new q3(w3Var, 1);
                    s6 s6Var = x6Var.E;
                    if (s6Var != null) {
                        if (s6Var.f45040b != null) {
                            q3Var.run();
                            return;
                        } else {
                            s6Var.d = q3Var;
                            return;
                        }
                    }
                    q3Var.run();
                    return;
                }
                return;
            default:
                w3 w3Var2 = this.f44862b;
                if (!w3Var2.T && !w3Var2.S) {
                    w3Var2.a(1.0f);
                    return;
                }
                return;
        }
    }
}
