package org.telegram.ui;
public final class e71 extends u71 {
    public final an f45224l2;
    public final boolean f45225m2;

    public e71(Object obj, an anVar, boolean z9) {
        super(obj, null, true);
        this.f45224l2 = anVar;
        this.f45225m2 = z9;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ym ymVar = this.f45224l2.f44022xa;
        ymVar.r(ymVar.f52270f, ymVar.f52271g, false, Boolean.valueOf(this.f45225m2), false);
    }
}
