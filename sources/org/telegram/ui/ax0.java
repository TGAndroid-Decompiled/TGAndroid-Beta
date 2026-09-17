package org.telegram.ui;
public final class ax0 extends a71 {
    public final PremiumPreviewFragment f34564e;

    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.f34564e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f34564e.f33796s0 = null;
    }
}
