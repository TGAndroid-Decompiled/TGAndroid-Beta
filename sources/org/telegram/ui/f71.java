package org.telegram.ui;
public final class f71 extends v71 {
    public final an f45472l2;
    public final boolean f45473m2;

    public f71(Object obj, an anVar, boolean z9) {
        super(obj, null, true);
        this.f45472l2 = anVar;
        this.f45473m2 = z9;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        ym ymVar = this.f45472l2.f44028xa;
        ymVar.r(ymVar.f52250f, ymVar.f52251g, false, Boolean.valueOf(this.f45473m2), false);
    }
}
