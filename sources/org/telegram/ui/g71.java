package org.telegram.ui;
public final class g71 extends w71 {
    public final cn f45930l2;
    public final boolean f45931m2;

    public g71(Object obj, cn cnVar, boolean z9) {
        super(obj, null, true);
        this.f45930l2 = cnVar;
        this.f45931m2 = z9;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        an anVar = this.f45930l2.f44709za;
        anVar.r(anVar.f43729f, anVar.f43730g, false, Boolean.valueOf(this.f45931m2), false);
    }
}
