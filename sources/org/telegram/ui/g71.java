package org.telegram.ui;
public final class g71 extends x71 {
    public final bn f47940m2;
    public final boolean f47941n2;

    public g71(Object obj, bn bnVar, boolean z10) {
        super(obj, null, true);
        this.f47940m2 = bnVar;
        this.f47941n2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zm zmVar = this.f47940m2.Ba;
        zmVar.r(zmVar.f54552f, zmVar.f54553g, false, Boolean.valueOf(this.f47941n2), false);
    }
}
