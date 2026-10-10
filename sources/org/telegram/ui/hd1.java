package org.telegram.ui;
public final class hd1 implements od1 {
    public boolean f38335a;
    public final zn f38336b;

    public hd1(zn znVar, boolean z10) {
        this.f38336b = znVar;
        this.f38335a = z10;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38335a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f38335a;
        this.f38335a = z11;
        xn xnVar = this.f38336b.f44807ea;
        xnVar.i(xnVar.f44116f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
