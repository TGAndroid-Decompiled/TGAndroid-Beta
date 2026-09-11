package org.telegram.ui;
public final class gd1 implements nd1 {
    public boolean f36632a;
    public final co f36633b;

    public gd1(co coVar, boolean z10) {
        this.f36633b = coVar;
        this.f36632a = z10;
    }

    @Override
    public final boolean Z0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f36632a;
    }

    @Override
    public final void p1(boolean z10) {
        boolean z11 = !this.f36632a;
        this.f36632a = z11;
        ao aoVar = this.f36633b.f35247ea;
        aoVar.i(aoVar.f34490f, aoVar.h, z10, Boolean.valueOf(z11), false);
    }
}
