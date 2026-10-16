package org.telegram.ui;
public final class ld1 extends ce1 {
    public final fo f37718k2;
    public final boolean f37719l2;

    public ld1(Object obj, fo foVar, boolean z10) {
        super(obj, null, true);
        this.f37718k2 = foVar;
        this.f37719l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        co coVar = this.f37718k2.f35633ea;
        coVar.i(coVar.f34740f, coVar.h, false, Boolean.valueOf(this.f37719l2), false);
    }
}
