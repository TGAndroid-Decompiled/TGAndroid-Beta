package org.telegram.ui;
public final class iw0 extends s51 {
    public final PremiumPreviewFragment e;

    public iw0(PremiumPreviewFragment premiumPreviewFragment, hw0 hw0Var) {
        super(hw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f33826v0 = null;
    }
}
