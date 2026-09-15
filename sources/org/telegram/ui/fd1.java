package org.telegram.ui;
public final class fd1 implements md1 {
    public boolean f33544a;
    public final bo f33545b;

    public fd1(bo boVar, boolean z10) {
        this.f33545b = boVar;
        this.f33544a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f33544a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f33544a;
        this.f33544a = z11;
        zn znVar = this.f33545b.f32297ea;
        znVar.i(znVar.f40244f, znVar.h, z10, Boolean.valueOf(z11), false);
    }
}
