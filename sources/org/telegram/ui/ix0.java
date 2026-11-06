package org.telegram.ui;
public final class ix0 implements Runnable {
    public final int f46771a;
    public final kx0 f46772b;
    public final int f46773c;

    public ix0(kx0 kx0Var, int i7, int i10) {
        this.f46771a = i10;
        this.f46772b = kx0Var;
        this.f46773c = i7;
    }

    @Override
    public final void run() {
        switch (this.f46771a) {
            case 0:
                kx0 kx0Var = this.f46772b;
                org.telegram.ui.Components.t61 t61Var = kx0Var.f47337b;
                jx0 jx0Var = kx0Var.d;
                int i7 = this.f46773c;
                t61Var.d(i7, jx0Var.i(i7));
                return;
            default:
                kx0 kx0Var2 = this.f46772b;
                org.telegram.ui.Components.t61 t61Var2 = kx0Var2.f47337b;
                jx0 jx0Var2 = kx0Var2.d;
                int i10 = this.f46773c;
                t61Var2.d(i10, jx0Var2.i(i10));
                return;
        }
    }
}
