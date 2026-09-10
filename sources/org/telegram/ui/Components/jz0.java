package org.telegram.ui.Components;
public final class jz0 extends nz0 {
    public int d;

    @Override
    public final int a(wz0 wz0Var, pz0 pz0Var, iz0 iz0Var, int i10, boolean z10) {
        return Math.max(0, this.f25621a - iz0Var.a(pz0Var, i10));
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
