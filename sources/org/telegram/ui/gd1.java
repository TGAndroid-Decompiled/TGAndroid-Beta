package org.telegram.ui;
public final class gd1 extends xd1 {
    public final zn f33865k2;
    public final boolean f33866l2;

    public gd1(Object obj, zn znVar, boolean z10) {
        super(obj, null, true);
        this.f33865k2 = znVar;
        this.f33866l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.f33865k2.f40303ea;
        xnVar.i(xnVar.f39630f, xnVar.h, false, Boolean.valueOf(this.f33866l2), false);
    }
}
