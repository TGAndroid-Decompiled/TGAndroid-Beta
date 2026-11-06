package org.telegram.ui.Components;
public final class yw0 extends cx0 {
    public int d;

    @Override
    public final int a(lx0 lx0Var, ex0 ex0Var, xw0 xw0Var, int i7, boolean z9) {
        return Math.max(0, this.f32694a - xw0Var.a(ex0Var, i7));
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
    public final int d(boolean z9) {
        return Math.max(super.d(z9), this.d);
    }
}
