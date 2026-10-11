package org.telegram.ui.Components;
public final class a01 extends e01 {
    public int d;

    @Override
    public final int a(n01 n01Var, g01 g01Var, zz0 zz0Var, int i10, boolean z10) {
        return Math.max(0, this.f25786a - zz0Var.a(g01Var, i10));
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
