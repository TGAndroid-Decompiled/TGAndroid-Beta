package org.telegram.ui;
public final class md1 implements td1 {
    public boolean f37970a;
    public final fo f37971b;

    public md1(fo foVar, boolean z10) {
        this.f37971b = foVar;
        this.f37970a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f37970a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f37970a;
        this.f37970a = z11;
        co coVar = this.f37971b.f35633ea;
        coVar.i(coVar.f34740f, coVar.h, z10, Boolean.valueOf(z11), false);
    }
}
