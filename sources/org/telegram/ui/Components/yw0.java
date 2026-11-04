package org.telegram.ui.Components;
public final class yw0 extends cx0 {
    public int d;

    @Override
    public final int a(lx0 lx0Var, ex0 ex0Var, xw0 xw0Var, int i3, boolean z10) {
        return Math.max(0, this.f32850a - xw0Var.a(ex0Var, i3));
    }

    @Override
    public final void b(int i3, int i10) {
        super.b(i3, i10);
        this.d = Math.max(this.d, i3 + i10);
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
