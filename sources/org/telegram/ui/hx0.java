package org.telegram.ui;
public final class hx0 implements Runnable {
    public final int f47839a;
    public final jx0 f47840b;
    public final int f47841c;

    public hx0(jx0 jx0Var, int i7, int i10) {
        this.f47839a = i10;
        this.f47840b = jx0Var;
        this.f47841c = i7;
    }

    @Override
    public final void run() {
        switch (this.f47839a) {
            case 0:
                jx0 jx0Var = this.f47840b;
                org.telegram.ui.Components.v61 v61Var = jx0Var.f48492b;
                ix0 ix0Var = jx0Var.d;
                int i7 = this.f47841c;
                v61Var.d(i7, ix0Var.i(i7));
                return;
            default:
                jx0 jx0Var2 = this.f47840b;
                org.telegram.ui.Components.v61 v61Var2 = jx0Var2.f48492b;
                ix0 ix0Var2 = jx0Var2.d;
                int i10 = this.f47841c;
                v61Var2.d(i10, ix0Var2.i(i10));
                return;
        }
    }
}
