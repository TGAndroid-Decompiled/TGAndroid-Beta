package org.telegram.ui;
public final class ks0 extends e11 {
    public final PremiumPreviewFragment f48751e;

    public ks0(PremiumPreviewFragment premiumPreviewFragment, js0 js0Var) {
        super(js0Var);
        this.f48751e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48751e.f43003v0 = null;
    }
}
