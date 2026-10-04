package org.telegram.ui;
public final class ad1 extends rd1 {
    public final yn f34794k2;
    public final boolean f34795l2;

    public ad1(Object obj, yn ynVar, boolean z10) {
        super(obj, null, true);
        this.f34794k2 = ynVar;
        this.f34795l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        wn wnVar = this.f34794k2.f43299ca;
        wnVar.i(wnVar.f42538f, wnVar.h, false, Boolean.valueOf(this.f34795l2), false);
    }
}
