package org.telegram.ui;
public final class ps0 extends j11 {
    public final PremiumPreviewFragment f48801e;

    public ps0(PremiumPreviewFragment premiumPreviewFragment, os0 os0Var) {
        super(os0Var);
        this.f48801e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48801e.f41639u0 = null;
    }
}
