package org.telegram.ui;
public final class ix0 implements Runnable {
    public final int f46773a;
    public final kx0 f46774b;
    public final int f46775c;

    public ix0(kx0 kx0Var, int i7, int i10) {
        this.f46773a = i10;
        this.f46774b = kx0Var;
        this.f46775c = i7;
    }

    @Override
    public final void run() {
        switch (this.f46773a) {
            case 0:
                kx0 kx0Var = this.f46774b;
                org.telegram.ui.Components.u61 u61Var = kx0Var.f47341b;
                jx0 jx0Var = kx0Var.d;
                int i7 = this.f46775c;
                u61Var.d(i7, jx0Var.i(i7));
                return;
            default:
                kx0 kx0Var2 = this.f46774b;
                org.telegram.ui.Components.u61 u61Var2 = kx0Var2.f47341b;
                jx0 jx0Var2 = kx0Var2.d;
                int i10 = this.f46775c;
                u61Var2.d(i10, jx0Var2.i(i10));
                return;
        }
    }
}
