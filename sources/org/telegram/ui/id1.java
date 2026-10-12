package org.telegram.ui;
public final class id1 extends zd1 {
    public final eo f38878k2;
    public final boolean f38879l2;

    public id1(Object obj, eo eoVar, boolean z10) {
        super(obj, null, true);
        this.f38878k2 = eoVar;
        this.f38879l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        bo boVar = this.f38878k2.f37251ea;
        boVar.i(boVar.f36218f, boVar.h, false, Boolean.valueOf(this.f38879l2), false);
    }
}
