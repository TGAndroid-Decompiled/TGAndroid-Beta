package org.telegram.ui;
public final class mw0 extends n61 {
    public final PremiumPreviewFragment e;

    public mw0(PremiumPreviewFragment premiumPreviewFragment, lw0 lw0Var) {
        super(lw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f31944p0 = null;
    }
}
