package org.telegram.ui;
public final class c11 implements Runnable {
    public final int f35790a;
    public final g11 f35791b;
    public final int f35792c;

    public c11(g11 g11Var, int i10, int i11) {
        this.f35790a = i11;
        this.f35791b = g11Var;
        this.f35792c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35790a) {
            case 0:
                g11 g11Var = this.f35791b;
                org.telegram.ui.Components.b91 b91Var = g11Var.f37108n;
                f11 f11Var = g11Var.f37110s;
                int i10 = this.f35792c;
                b91Var.d(i10, f11Var.i(i10));
                return;
            default:
                g11 g11Var2 = this.f35791b;
                org.telegram.ui.Components.b91 b91Var2 = g11Var2.f37108n;
                f11 f11Var2 = g11Var2.f37110s;
                int i11 = this.f35792c;
                b91Var2.d(i11, f11Var2.i(i11));
                return;
        }
    }
}
