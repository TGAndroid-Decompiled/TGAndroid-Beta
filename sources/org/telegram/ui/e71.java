package org.telegram.ui;
public final class e71 extends v71 {
    public final bn f47469m2;
    public final boolean f47470n2;

    public e71(Object obj, bn bnVar, boolean z10) {
        super(obj, null, true);
        this.f47469m2 = bnVar;
        this.f47470n2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zm zmVar = this.f47469m2.Ba;
        zmVar.r(zmVar.f54653f, zmVar.f54654g, false, Boolean.valueOf(this.f47470n2), false);
    }
}
