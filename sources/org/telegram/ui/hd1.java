package org.telegram.ui;
public final class hd1 implements od1 {
    public boolean f38289a;
    public final zn f38290b;

    public hd1(zn znVar, boolean z10) {
        this.f38290b = znVar;
        this.f38289a = z10;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38289a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f38289a;
        this.f38289a = z11;
        xn xnVar = this.f38290b.f44761ea;
        xnVar.i(xnVar.f44070f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
