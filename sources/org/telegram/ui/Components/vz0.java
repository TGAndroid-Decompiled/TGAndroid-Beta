package org.telegram.ui.Components;
public final class vz0 extends zz0 {
    public int d;

    @Override
    public final int a(i01 i01Var, b01 b01Var, uz0 uz0Var, int i10, boolean z10) {
        return Math.max(0, this.f31722a - uz0Var.a(b01Var, i10));
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
