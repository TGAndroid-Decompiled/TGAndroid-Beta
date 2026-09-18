package org.telegram.ui;
public final class fd1 implements md1 {
    public boolean f33515a;
    public final zn f33516b;

    public fd1(zn znVar, boolean z10) {
        this.f33516b = znVar;
        this.f33515a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f33515a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f33515a;
        this.f33515a = z11;
        xn xnVar = this.f33516b.f40261ea;
        xnVar.i(xnVar.f39525f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
