package org.telegram.ui;
public final class kd1 implements rd1 {
    public boolean f34338a;
    public final eo f34339b;

    public kd1(eo eoVar, boolean z10) {
        this.f34339b = eoVar;
        this.f34338a = z10;
    }

    @Override
    public final boolean Y0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f34338a;
    }

    @Override
    public final void n1(boolean z10) {
        boolean z11 = !this.f34338a;
        this.f34338a = z11;
        bo boVar = this.f34339b.f32316ea;
        boVar.i(boVar.f31302f, boVar.h, z10, Boolean.valueOf(z11), false);
    }
}
