package org.telegram.ui;
public final class ix0 implements Runnable {
    public final int f46747a;
    public final kx0 f46748b;
    public final int f46749c;

    public ix0(kx0 kx0Var, int i7, int i10) {
        this.f46747a = i10;
        this.f46748b = kx0Var;
        this.f46749c = i7;
    }

    @Override
    public final void run() {
        switch (this.f46747a) {
            case 0:
                kx0 kx0Var = this.f46748b;
                org.telegram.ui.Components.o61 o61Var = kx0Var.f47310b;
                jx0 jx0Var = kx0Var.d;
                int i7 = this.f46749c;
                o61Var.d(i7, jx0Var.i(i7));
                return;
            default:
                kx0 kx0Var2 = this.f46748b;
                org.telegram.ui.Components.o61 o61Var2 = kx0Var2.f47310b;
                jx0 jx0Var2 = kx0Var2.d;
                int i10 = this.f46749c;
                o61Var2.d(i10, jx0Var2.i(i10));
                return;
        }
    }
}
