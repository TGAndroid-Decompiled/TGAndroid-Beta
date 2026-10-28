package org.telegram.ui;
public final class ow0 extends w51 {
    public final PremiumPreviewFragment e;

    public ow0(PremiumPreviewFragment premiumPreviewFragment, nw0 nw0Var) {
        super(nw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f35916v0 = null;
    }
}
