package org.telegram.ui;
public final class c11 implements Runnable {
    public final int f35803a;
    public final g11 f35804b;
    public final int f35805c;

    public c11(g11 g11Var, int i10, int i11) {
        this.f35803a = i11;
        this.f35804b = g11Var;
        this.f35805c = i10;
    }

    @Override
    public final void run() {
        switch (this.f35803a) {
            case 0:
                g11 g11Var = this.f35804b;
                org.telegram.ui.Components.b91 b91Var = g11Var.f37078n;
                f11 f11Var = g11Var.f37080s;
                int i10 = this.f35805c;
                b91Var.d(i10, f11Var.i(i10));
                return;
            default:
                g11 g11Var2 = this.f35804b;
                org.telegram.ui.Components.b91 b91Var2 = g11Var2.f37078n;
                f11 f11Var2 = g11Var2.f37080s;
                int i11 = this.f35805c;
                b91Var2.d(i11, f11Var2.i(i11));
                return;
        }
    }
}
