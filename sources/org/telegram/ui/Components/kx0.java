package org.telegram.ui.Components;
public final class kx0 extends ox0 {
    public int d;

    @Override
    public final int a(xx0 xx0Var, qx0 qx0Var, jx0 jx0Var, int i7, boolean z10) {
        return Math.max(0, this.f38274a - jx0Var.a(qx0Var, i7));
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
