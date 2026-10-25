package org.telegram.ui.Components;
public final class d01 extends h01 {
    public int d;

    @Override
    public final int a(q01 q01Var, j01 j01Var, gb1 gb1Var, int i10, boolean z10) {
        return Math.max(0, this.f28754a - gb1Var.F(j01Var, i10));
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
