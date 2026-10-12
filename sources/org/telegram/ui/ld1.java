package org.telegram.ui;
public final class ld1 extends ce1 {
    public final fo f37924k2;
    public final boolean f37925l2;

    public ld1(Object obj, fo foVar, boolean z10) {
        super(obj, null, true);
        this.f37924k2 = foVar;
        this.f37925l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        co coVar = this.f37924k2.f35932ea;
        coVar.i(coVar.f34982f, coVar.h, false, Boolean.valueOf(this.f37925l2), false);
    }
}
