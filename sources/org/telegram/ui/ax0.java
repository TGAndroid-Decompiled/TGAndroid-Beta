package org.telegram.ui;
public final class ax0 extends b71 {
    public final PremiumPreviewFragment f36116e;

    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.f36116e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f36116e.f34188s0 = null;
    }
}
