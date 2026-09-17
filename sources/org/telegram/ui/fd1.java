package org.telegram.ui;
public final class fd1 extends wd1 {
    public final co f36378k2;
    public final boolean f36379l2;

    public fd1(Object obj, co coVar, boolean z10) {
        super(obj, null, true);
        this.f36378k2 = coVar;
        this.f36379l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ao aoVar = this.f36378k2.f35248ea;
        aoVar.i(aoVar.f34491f, aoVar.h, false, Boolean.valueOf(this.f36379l2), false);
    }
}
