package org.telegram.ui.Components;
public final class zw0 extends dx0 {
    public int d;

    @Override
    public final int a(mx0 mx0Var, fx0 fx0Var, yw0 yw0Var, int i7, boolean z9) {
        return Math.max(0, this.f33096a - yw0Var.a(fx0Var, i7));
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
    public final int d(boolean z9) {
        return Math.max(super.d(z9), this.d);
    }
}
