package org.telegram.ui;
public final class fd1 extends wd1 {
    public final co f36405k2;
    public final boolean f36406l2;

    public fd1(Object obj, co coVar, boolean z10) {
        super(obj, null, true);
        this.f36405k2 = coVar;
        this.f36406l2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ao aoVar = this.f36405k2.f35275ea;
        aoVar.i(aoVar.f34518f, aoVar.h, false, Boolean.valueOf(this.f36406l2), false);
    }
}
