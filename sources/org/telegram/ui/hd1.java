package org.telegram.ui;
public final class hd1 implements od1 {
    public boolean f34240a;
    public final bo f34241b;

    public hd1(bo boVar, boolean z10) {
        this.f34241b = boVar;
        this.f34240a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f34240a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f34240a;
        this.f34240a = z11;
        zn znVar = this.f34241b.f32275ea;
        znVar.i(znVar.f40280f, znVar.h, z10, Boolean.valueOf(z11), false);
    }
}
