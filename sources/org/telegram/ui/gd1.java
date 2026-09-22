package org.telegram.ui;
public final class gd1 extends xd1 {
    public final zn f33893k2;
    public final boolean f33894l2;

    public gd1(Object obj, zn znVar, boolean z10) {
        super(obj, null, true);
        this.f33893k2 = znVar;
        this.f33894l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.f33893k2.f40324ea;
        xnVar.i(xnVar.f39650f, xnVar.h, false, Boolean.valueOf(this.f33894l2), false);
    }
}
