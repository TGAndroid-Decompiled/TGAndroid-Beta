package org.telegram.ui.Components;
public final class cy0 extends gy0 {
    public int d;

    @Override
    public final int a(py0 py0Var, iy0 iy0Var, by0 by0Var, int i10, boolean z10) {
        return Math.max(0, this.f26538a - by0Var.a(iy0Var, i10));
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
