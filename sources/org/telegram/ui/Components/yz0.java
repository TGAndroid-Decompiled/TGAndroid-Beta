package org.telegram.ui.Components;
public final class yz0 extends c01 {
    public int d;

    @Override
    public final int a(l01 l01Var, e01 e01Var, xz0 xz0Var, int i10, boolean z10) {
        return Math.max(0, this.f25199a - xz0Var.a(e01Var, i10));
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
