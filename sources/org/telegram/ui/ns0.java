package org.telegram.ui;
public final class ns0 extends h11 {
    public final PremiumPreviewFragment f48130e;

    public ns0(PremiumPreviewFragment premiumPreviewFragment, ms0 ms0Var) {
        super(ms0Var);
        this.f48130e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48130e.f41632u0 = null;
    }
}
