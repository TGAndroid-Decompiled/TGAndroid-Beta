package org.telegram.ui;
public final class gd1 extends xd1 {
    public final bo f33952k2;
    public final boolean f33953l2;

    public gd1(Object obj, bo boVar, boolean z10) {
        super(obj, null, true);
        this.f33952k2 = boVar;
        this.f33953l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zn znVar = this.f33952k2.f32275ea;
        znVar.i(znVar.f40280f, znVar.h, false, Boolean.valueOf(this.f33953l2), false);
    }
}
