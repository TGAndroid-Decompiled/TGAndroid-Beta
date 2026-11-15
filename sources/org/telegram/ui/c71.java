package org.telegram.ui;
public final class c71 extends t71 {
    public final an f46047m2;
    public final boolean f46048n2;

    public c71(Object obj, an anVar, boolean z10) {
        super(obj, null, true);
        this.f46047m2 = anVar;
        this.f46048n2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ym ymVar = this.f46047m2.Aa;
        ymVar.r(ymVar.f53545f, ymVar.f53546g, false, Boolean.valueOf(this.f46048n2), false);
    }
}
