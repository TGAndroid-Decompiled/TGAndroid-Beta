package org.telegram.ui.Components;
public final class cx0 extends gx0 {
    public int d;

    @Override
    public final int a(px0 px0Var, ix0 ix0Var, bx0 bx0Var, int i7, boolean z10) {
        return Math.max(0, this.f35080a - bx0Var.a(ix0Var, i7));
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
