package org.telegram.ui.Components;

public final class gy0 extends ky0 {
    public int d;

    @Override
    public final int a(ty0 ty0Var, my0 my0Var, fy0 fy0Var, int i10, boolean z10) {
        return Math.max(0, this.f30223a - fy0Var.a(my0Var, i10));
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
