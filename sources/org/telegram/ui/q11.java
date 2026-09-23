package org.telegram.ui;
public final class q11 implements Runnable {
    public final int f36240a;
    public final u11 f36241b;
    public final int f36242c;

    public q11(u11 u11Var, int i10, int i11) {
        this.f36240a = i11;
        this.f36241b = u11Var;
        this.f36242c = i10;
    }

    @Override
    public final void run() {
        switch (this.f36240a) {
            case 0:
                u11 u11Var = this.f36241b;
                org.telegram.ui.Components.g81 g81Var = u11Var.f37871n;
                t11 t11Var = u11Var.f37873s;
                int i10 = this.f36242c;
                g81Var.d(i10, t11Var.i(i10));
                return;
            default:
                u11 u11Var2 = this.f36241b;
                org.telegram.ui.Components.g81 g81Var2 = u11Var2.f37871n;
                t11 t11Var2 = u11Var2.f37873s;
                int i11 = this.f36242c;
                g81Var2.d(i11, t11Var2.i(i11));
                return;
        }
    }
}
