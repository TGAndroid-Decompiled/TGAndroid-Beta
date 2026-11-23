package org.telegram.ui;
public final class os0 extends j11 {
    public final PremiumPreviewFragment f50652e;

    public os0(PremiumPreviewFragment premiumPreviewFragment, ns0 ns0Var) {
        super(ns0Var);
        this.f50652e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f50652e.f43493v0 = null;
    }
}
