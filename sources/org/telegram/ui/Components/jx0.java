package org.telegram.ui.Components;
public final class jx0 extends nx0 {
    public int d;

    @Override
    public final int a(wx0 wx0Var, px0 px0Var, ix0 ix0Var, int i7, boolean z10) {
        return Math.max(0, this.f37870a - ix0Var.a(px0Var, i7));
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
    public final int d(boolean z10) {
        return Math.max(super.d(z10), this.d);
    }
}
