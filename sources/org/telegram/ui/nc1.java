package org.telegram.ui;
public final class nc1 extends ed1 {
    public final xn f39381h2;
    public final boolean f39382i2;

    public nc1(Object obj, xn xnVar, boolean z4) {
        super(obj, null, true);
        this.f39381h2 = xnVar;
        this.f39382i2 = z4;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        vn vnVar = this.f39381h2.f43136ba;
        vnVar.i(vnVar.f42262f, vnVar.h, false, Boolean.valueOf(this.f39382i2), false);
    }
}
