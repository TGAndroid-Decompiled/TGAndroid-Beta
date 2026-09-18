package org.telegram.ui;
public final class gd1 extends xd1 {
    public final bo f33956k2;
    public final boolean f33957l2;

    public gd1(Object obj, bo boVar, boolean z10) {
        super(obj, null, true);
        this.f33956k2 = boVar;
        this.f33957l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zn znVar = this.f33956k2.f32279ea;
        znVar.i(znVar.f40285f, znVar.h, false, Boolean.valueOf(this.f33957l2), false);
    }
}
