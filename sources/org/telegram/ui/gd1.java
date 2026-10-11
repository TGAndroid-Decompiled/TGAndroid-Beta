package org.telegram.ui;
public final class gd1 implements nd1 {
    public boolean f38049a;
    public final zn f38050b;

    public gd1(zn znVar, boolean z10) {
        this.f38050b = znVar;
        this.f38049a = z10;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38049a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f38049a;
        this.f38049a = z11;
        xn xnVar = this.f38050b.f44762ea;
        xnVar.i(xnVar.f44115f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
