package org.telegram.ui;
public final class md1 implements td1 {
    public boolean f38225a;
    public final fo f38226b;

    public md1(fo foVar, boolean z10) {
        this.f38226b = foVar;
        this.f38225a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f38225a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f38225a;
        this.f38225a = z11;
        co coVar = this.f38226b.f35932ea;
        coVar.i(coVar.f34982f, coVar.h, z10, Boolean.valueOf(z11), false);
    }
}
