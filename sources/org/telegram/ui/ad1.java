package org.telegram.ui;
public final class ad1 extends rd1 {
    public final yn f34800k2;
    public final boolean f34801l2;

    public ad1(Object obj, yn ynVar, boolean z10) {
        super(obj, null, true);
        this.f34800k2 = ynVar;
        this.f34801l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        wn wnVar = this.f34800k2.f43307ca;
        wnVar.i(wnVar.f42546f, wnVar.h, false, Boolean.valueOf(this.f34801l2), false);
    }
}
