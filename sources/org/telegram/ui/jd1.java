package org.telegram.ui;
public final class jd1 implements qd1 {
    public boolean f39183a;
    public final eo f39184b;

    public jd1(eo eoVar, boolean z10) {
        this.f39184b = eoVar;
        this.f39183a = z10;
    }

    @Override
    public final boolean T0() {
        return true;
    }

    @Override
    public final boolean a() {
        return this.f39183a;
    }

    @Override
    public final void l1(boolean z10) {
        boolean z11 = !this.f39183a;
        this.f39183a = z11;
        bo boVar = this.f39184b.f37251ea;
        boVar.i(boVar.f36218f, boVar.h, z10, Boolean.valueOf(z11), false);
    }
}
