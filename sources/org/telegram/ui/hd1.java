package org.telegram.ui;
public final class hd1 implements od1 {
    public boolean f38291a;
    public final zn f38292b;

    public hd1(zn znVar, boolean z10) {
        this.f38292b = znVar;
        this.f38291a = z10;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38291a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f38291a;
        this.f38291a = z11;
        xn xnVar = this.f38292b.f44763ea;
        xnVar.i(xnVar.f44072f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
