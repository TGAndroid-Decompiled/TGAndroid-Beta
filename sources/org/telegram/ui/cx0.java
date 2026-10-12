package org.telegram.ui;
public final class cx0 extends e71 {
    public final PremiumPreviewFragment f36578e;

    public cx0(PremiumPreviewFragment premiumPreviewFragment, bx0 bx0Var) {
        super(bx0Var);
        this.f36578e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f36578e.f33989s0 = null;
    }
}
