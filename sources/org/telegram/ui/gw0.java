package org.telegram.ui;
public final class gw0 extends q51 {
    public final PremiumPreviewFragment e;

    public gw0(PremiumPreviewFragment premiumPreviewFragment, fw0 fw0Var) {
        super(fw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f33509s0 = null;
    }
}
