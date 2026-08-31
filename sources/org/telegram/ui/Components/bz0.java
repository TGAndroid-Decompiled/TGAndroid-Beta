package org.telegram.ui.Components;
public final class bz0 extends fz0 {
    public int d;

    @Override
    public final int a(oz0 oz0Var, hz0 hz0Var, az0 az0Var, int i10, boolean z4) {
        return Math.max(0, this.f27049a - az0Var.a(hz0Var, i10));
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
    public final int d(boolean z4) {
        return Math.max(super.d(z4), this.d);
    }
}
