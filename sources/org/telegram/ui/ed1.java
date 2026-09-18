package org.telegram.ui;
public final class ed1 extends vd1 {
    public final zn f33261k2;
    public final boolean f33262l2;

    public ed1(Object obj, zn znVar, boolean z10) {
        super(obj, null, true);
        this.f33261k2 = znVar;
        this.f33262l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.f33261k2.f40261ea;
        xnVar.i(xnVar.f39525f, xnVar.h, false, Boolean.valueOf(this.f33262l2), false);
    }
}
