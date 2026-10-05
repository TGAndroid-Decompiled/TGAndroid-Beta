package org.telegram.ui.Components;
public final class tz0 extends xz0 {
    public int d;

    @Override
    public final int a(g01 g01Var, zz0 zz0Var, sz0 sz0Var, int i10, boolean z10) {
        return Math.max(0, this.f33123a - sz0Var.a(zz0Var, i10));
    }

    @Override
    public final void b(int i10, int i11) {
        super.b(i10, i11);
        this.d = Math.max(this.d, i10 + i11);
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
