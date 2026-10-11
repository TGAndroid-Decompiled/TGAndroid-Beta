package org.telegram.ui;
public final class gd1 implements nd1 {
    public boolean f38083a;
    public final zn f38084b;

    public gd1(zn znVar, boolean z10) {
        this.f38084b = znVar;
        this.f38083a = z10;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38083a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f38083a;
        this.f38083a = z11;
        xn xnVar = this.f38084b.f44796ea;
        xnVar.i(xnVar.f44149f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
