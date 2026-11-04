package org.telegram.ui;
public final class ds0 extends x01 {
    public final PremiumPreviewFragment f44806e;

    public ds0(PremiumPreviewFragment premiumPreviewFragment, cs0 cs0Var) {
        super(cs0Var);
        this.f44806e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f44806e.f41660v0 = null;
    }
}
