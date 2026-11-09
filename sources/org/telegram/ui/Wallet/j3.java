package org.telegram.ui.Wallet;
public final class j3 implements Runnable {
    public final int f42623a;
    public final n3 f42624b;

    public j3(n3 n3Var, int i7) {
        this.f42623a = i7;
        this.f42624b = n3Var;
    }

    @Override
    public final void run() {
        switch (this.f42623a) {
            case 0:
                n3 n3Var = this.f42624b;
                if (!n3Var.S && !n3Var.R) {
                    n3Var.a(1.0f);
                    return;
                }
                return;
            default:
                n3 n3Var2 = this.f42624b;
                if (!n3Var2.S && !n3Var2.R) {
                    ih.d.c(n3Var2.E, n3Var2.h);
                    n3Var2.F.d();
                    f6 f6Var = n3Var2.f42866r;
                    j3 j3Var = new j3(n3Var2, 0);
                    a6 a6Var = f6Var.D;
                    if (a6Var != null) {
                        if (a6Var.f42113b != null) {
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
