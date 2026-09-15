package org.telegram.ui;
public final class ed1 extends vd1 {
    public final bo f33316k2;
    public final boolean f33317l2;

    public ed1(Object obj, bo boVar, boolean z10) {
        super(obj, null, true);
        this.f33316k2 = boVar;
        this.f33317l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zn znVar = this.f33316k2.f32297ea;
        znVar.i(znVar.f40244f, znVar.h, false, Boolean.valueOf(this.f33317l2), false);
    }
}
