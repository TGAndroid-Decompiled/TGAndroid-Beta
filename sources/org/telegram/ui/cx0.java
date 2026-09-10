package org.telegram.ui;
public final class cx0 extends c71 {
    public final PremiumPreviewFragment e;

    public cx0(PremiumPreviewFragment premiumPreviewFragment, bx0 bx0Var) {
        super(bx0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f30291s0 = null;
    }
}
