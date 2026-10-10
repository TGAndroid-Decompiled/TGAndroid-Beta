package org.telegram.ui;
public final class gd1 extends xd1 {
    public final zn f38027k2;
    public final boolean f38028l2;

    public gd1(Object obj, zn znVar, boolean z10) {
        super(obj, null, true);
        this.f38027k2 = znVar;
        this.f38028l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        xn xnVar = this.f38027k2.f44807ea;
        xnVar.i(xnVar.f44116f, xnVar.h, false, Boolean.valueOf(this.f38028l2), false);
    }
}
