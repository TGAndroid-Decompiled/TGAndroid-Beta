package org.telegram.ui.Components;
public final class lx0 extends px0 {
    public int d;

    @Override
    public final int a(yx0 yx0Var, rx0 rx0Var, kx0 kx0Var, int i7, boolean z10) {
        return Math.max(0, this.f38673a - kx0Var.a(rx0Var, i7));
    }

    @Override
    public final void b(int i7, int i10) {
        super.b(i7, i10);
        this.d = Math.max(this.d, i7 + i10);
    }

    @Override
    public final void c() {
        super.c();
        this.d = Integer.MIN_VALUE;
    }

    @Override
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}
