package org.telegram.ui;
public final class mw0 extends n61 {
    public final PremiumPreviewFragment f39128e;

    public mw0(PremiumPreviewFragment premiumPreviewFragment, lw0 lw0Var) {
        super(lw0Var);
        this.f39128e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f39128e.f34500p0 = null;
    }
}
