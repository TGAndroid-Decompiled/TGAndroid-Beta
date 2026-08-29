package org.telegram.ui.Components;
public final class py0 extends ty0 {
    public int d;

    @Override
    public final int a(cz0 cz0Var, vy0 vy0Var, oy0 oy0Var, int i10, boolean z10) {
        return Math.max(0, this.f33060a - oy0Var.a(vy0Var, i10));
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
