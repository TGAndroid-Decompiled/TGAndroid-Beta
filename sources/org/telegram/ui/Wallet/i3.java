package org.telegram.ui.Wallet;
public final class i3 implements Runnable {
    public final int f43973a;
    public final o3 f43974b;

    public i3(o3 o3Var, int i7) {
        this.f43973a = i7;
        this.f43974b = o3Var;
    }

    @Override
    public final void run() {
        switch (this.f43973a) {
            case 0:
                o3 o3Var = this.f43974b;
                if (!o3Var.T && !o3Var.S) {
                    ih.d.c(o3Var.F, o3Var.h);
                    o3Var.G.d();
                    h6 h6Var = o3Var.f44229r;
                    i3 i3Var = new i3(o3Var, 1);
                    c6 c6Var = h6Var.E;
                    if (c6Var != null) {
                        if (c6Var.f43621b != null) {
                            i3Var.run();
                            return;
                        } else {
                            c6Var.d = i3Var;
                            return;
                        }
                    }
                    i3Var.run();
                    return;
                }
                return;
            default:
                o3 o3Var2 = this.f43974b;
                if (!o3Var2.T && !o3Var2.S) {
                    o3Var2.a(1.0f);
                    return;
                }
                return;
        }
    }
}
