package org.telegram.ui.Components;
public final class zz0 extends d01 {
    public int d;

    @Override
    public final int a(m01 m01Var, f01 f01Var, yz0 yz0Var, int i10, boolean z10) {
        return Math.max(0, this.f25507a - yz0Var.a(f01Var, i10));
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
