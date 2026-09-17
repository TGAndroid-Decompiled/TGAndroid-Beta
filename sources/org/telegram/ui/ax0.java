package org.telegram.ui;
public final class ax0 extends a71 {
    public final PremiumPreviewFragment f34591e;

    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.f34591e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f34591e.f33823s0 = null;
    }
}
