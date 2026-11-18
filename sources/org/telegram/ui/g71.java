package org.telegram.ui;
public final class g71 extends x71 {
    public final bn f47919m2;
    public final boolean f47920n2;

    public g71(Object obj, bn bnVar, boolean z10) {
        super(obj, null, true);
        this.f47919m2 = bnVar;
        this.f47920n2 = z10;
    }

    @Override
    public final void onFragmentClosed() {
        super.onFragmentClosed();
        zm zmVar = this.f47919m2.Ba;
        zmVar.r(zmVar.f54538f, zmVar.f54539g, false, Boolean.valueOf(this.f47920n2), false);
    }
}
