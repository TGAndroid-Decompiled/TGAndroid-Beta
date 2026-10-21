package org.telegram.ui;
public final class ew0 extends o51 {
    public final PremiumPreviewFragment e;

    public ew0(PremiumPreviewFragment premiumPreviewFragment, dw0 dw0Var) {
        super(dw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f33522s0 = null;
    }
}
