package org.telegram.ui;
public final class h71 extends x71 {
    public final cn f46242l2;
    public final boolean f46243m2;

    public h71(Object obj, cn cnVar, boolean z9) {
        super(obj, null, true);
        this.f46242l2 = cnVar;
        this.f46243m2 = z9;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        an anVar = this.f46242l2.f44750za;
        anVar.r(anVar.f43729f, anVar.f43730g, false, Boolean.valueOf(this.f46243m2), false);
    }
}
