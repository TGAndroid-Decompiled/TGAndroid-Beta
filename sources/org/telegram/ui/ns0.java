package org.telegram.ui;
public final class ns0 extends h11 {
    public final PremiumPreviewFragment f50428e;

    public ns0(PremiumPreviewFragment premiumPreviewFragment, ms0 ms0Var) {
        super(ms0Var);
        this.f50428e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f50428e.f43574v0 = null;
    }
}
