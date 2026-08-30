package org.telegram.ui;
public final class lc1 extends cd1 {
    public final xn f36062h2;
    public final boolean f36063i2;

    public lc1(Object obj, xn xnVar, boolean z4) {
        super(obj, null, true);
        this.f36062h2 = xnVar;
        this.f36063i2 = z4;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        vn vnVar = this.f36062h2.f39968ba;
        vnVar.i(vnVar.f39218f, vnVar.h, false, Boolean.valueOf(this.f36063i2), false);
    }
}
