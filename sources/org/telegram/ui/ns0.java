package org.telegram.ui;
public final class ns0 extends h11 {
    public final PremiumPreviewFragment f48131e;

    public ns0(PremiumPreviewFragment premiumPreviewFragment, ms0 ms0Var) {
        super(ms0Var);
        this.f48131e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48131e.f41629u0 = null;
    }
}
