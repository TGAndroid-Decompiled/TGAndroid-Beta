package org.telegram.ui;
public final class gd1 implements nd1 {
    public boolean f33818a;
    public final bo f33819b;

    public gd1(bo boVar, boolean z10) {
        this.f33819b = boVar;
        this.f33818a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f33818a;
    }

    @Override
    public final void o1(boolean z10) {
        boolean z11 = !this.f33818a;
        this.f33818a = z11;
        zn znVar = this.f33819b.f32293ea;
        znVar.i(znVar.f40237f, znVar.h, z10, Boolean.valueOf(z11), false);
    }
}
