package org.telegram.ui;
public final class hd1 implements od1 {
    public boolean f34189a;
    public final zn f34190b;

    public hd1(zn znVar, boolean z10) {
        this.f34190b = znVar;
        this.f34189a = z10;
    }

    @Override
    public final boolean V0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f34189a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f34189a;
        this.f34189a = z11;
        xn xnVar = this.f34190b.f40324ea;
        xnVar.i(xnVar.f39650f, xnVar.h, z10, Boolean.valueOf(z11), false);
    }
}
