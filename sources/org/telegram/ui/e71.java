package org.telegram.ui;
public final class e71 extends u71 {
    public final an f45195l2;
    public final boolean f45196m2;

    public e71(Object obj, an anVar, boolean z9) {
        super(obj, null, true);
        this.f45195l2 = anVar;
        this.f45196m2 = z9;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ym ymVar = this.f45195l2.f43998xa;
        ymVar.r(ymVar.f52251f, ymVar.f52252g, false, Boolean.valueOf(this.f45196m2), false);
    }
}
