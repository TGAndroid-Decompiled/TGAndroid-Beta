package org.telegram.ui;
public final class ks0 extends e11 {
    public final PremiumPreviewFragment f48755e;

    public ks0(PremiumPreviewFragment premiumPreviewFragment, js0 js0Var) {
        super(js0Var);
        this.f48755e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f48755e.f43003v0 = null;
    }
}
