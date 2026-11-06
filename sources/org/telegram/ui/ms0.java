package org.telegram.ui;
public final class ms0 extends h11 {
    public final PremiumPreviewFragment f47845e;

    public ms0(PremiumPreviewFragment premiumPreviewFragment, ls0 ls0Var) {
        super(ls0Var);
        this.f47845e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f47845e.f41604u0 = null;
    }
}
