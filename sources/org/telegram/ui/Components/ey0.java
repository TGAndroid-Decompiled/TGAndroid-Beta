package org.telegram.ui.Components;
public final class ey0 extends iy0 {
    public int d;

    @Override
    public final int a(ry0 ry0Var, ky0 ky0Var, dy0 dy0Var, int i9, boolean z10) {
        return Math.max(0, this.f29544a - dy0Var.a(ky0Var, i9));
    }

    @Override
    public final void b(int i9, int i10) {
        super.b(i9, i10);
        this.d = Math.max(this.d, i9 + i10);
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
