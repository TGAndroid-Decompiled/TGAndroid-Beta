package org.telegram.ui;
public final class ax0 extends a71 {
    public final PremiumPreviewFragment f34563e;

    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.f34563e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f34563e.f33795s0 = null;
    }
}
