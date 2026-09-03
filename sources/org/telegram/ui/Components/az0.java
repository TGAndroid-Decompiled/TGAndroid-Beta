package org.telegram.ui.Components;
public final class az0 extends ez0 {
    public int d;

    @Override
    public final int a(nz0 nz0Var, gz0 gz0Var, zy0 zy0Var, int i10, boolean z4) {
        return Math.max(0, this.f26700a - zy0Var.a(gz0Var, i10));
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
