package org.telegram.ui;
public final class hd1 implements od1 {
    public boolean f34245a;
    public final bo f34246b;

    public hd1(bo boVar, boolean z10) {
        this.f34246b = boVar;
        this.f34245a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f34245a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f34245a;
        this.f34245a = z11;
        zn znVar = this.f34246b.f32279ea;
        znVar.i(znVar.f40285f, znVar.h, z10, Boolean.valueOf(z11), false);
    }
}
