package org.telegram.ui;
public final class jd1 implements qd1 {
    public boolean f39185a;
    public final eo f39186b;

    public jd1(eo eoVar, boolean z10) {
        this.f39186b = eoVar;
        this.f39185a = z10;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f39185a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f39185a;
        this.f39185a = z11;
        bo boVar = this.f39186b.f37256ea;
        boVar.i(boVar.f36220f, boVar.h, z10, Boolean.valueOf(z11), false);
    }
}
