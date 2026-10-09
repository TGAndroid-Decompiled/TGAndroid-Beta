package org.telegram.ui;
public final class gd1 extends xd1 {
    public final zn f37983k2;
    public final boolean f37984l2;

    public gd1(Object obj, zn znVar, boolean z10) {
        super(obj, null, true);
        this.f37983k2 = znVar;
        this.f37984l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.f37983k2.f44763ea;
        xnVar.i(xnVar.f44072f, xnVar.h, false, Boolean.valueOf(this.f37984l2), false);
    }
}
