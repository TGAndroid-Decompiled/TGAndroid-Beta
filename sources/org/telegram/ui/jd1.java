package org.telegram.ui;
public final class jd1 extends ae1 {
    public final eo f34080k2;
    public final boolean f34081l2;

    public jd1(Object obj, eo eoVar, boolean z10) {
        super(obj, null, true);
        this.f34080k2 = eoVar;
        this.f34081l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        bo boVar = this.f34080k2.f32316ea;
        boVar.i(boVar.f31302f, boVar.h, false, Boolean.valueOf(this.f34081l2), false);
    }
}
