package org.telegram.ui;
public final class e71 extends u71 {
    public final an f45225l2;
    public final boolean f45226m2;

    public e71(Object obj, an anVar, boolean z9) {
        super(obj, null, true);
        this.f45225l2 = anVar;
        this.f45226m2 = z9;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ym ymVar = this.f45225l2.f44023xa;
        ymVar.r(ymVar.f52272f, ymVar.f52273g, false, Boolean.valueOf(this.f45226m2), false);
    }
}
