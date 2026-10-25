package org.telegram.ui;
public final class mw0 extends t51 {
    public final PremiumPreviewFragment e;

    public mw0(PremiumPreviewFragment premiumPreviewFragment, lw0 lw0Var) {
        super(lw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f35889v0 = null;
    }
}
