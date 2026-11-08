package org.telegram.ui.Wallet;
public final class k3 implements Runnable {
    public final int f42704a;
    public final o3 f42705b;

    public k3(o3 o3Var, int i7) {
        this.f42704a = i7;
        this.f42705b = o3Var;
    }

    @Override
    public final void run() {
        switch (this.f42704a) {
            case 0:
                o3 o3Var = this.f42705b;
                if (!o3Var.S && !o3Var.R) {
                    o3Var.a(1.0f);
                    return;
                }
                return;
            default:
                o3 o3Var2 = this.f42705b;
                if (!o3Var2.S && !o3Var2.R) {
                    ih.d.c(o3Var2.E, o3Var2.h);
                    o3Var2.F.d();
                    g6 g6Var = o3Var2.f42948r;
                    k3 k3Var = new k3(o3Var2, 0);
                    b6 b6Var = g6Var.D;
                    if (b6Var != null) {
                        if (b6Var.f42193b != null) {
                            k3Var.run();
                            return;
                        } else {
                            b6Var.d = k3Var;
                            return;
                        }
                    }
                    k3Var.run();
                    return;
                }
                return;
        }
    }
}
