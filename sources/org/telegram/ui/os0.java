package org.telegram.ui;
public final class os0 extends i11 {
    public final PremiumPreviewFragment f50659e;

    public os0(PremiumPreviewFragment premiumPreviewFragment, ns0 ns0Var) {
        super(ns0Var);
        this.f50659e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f50659e.f43448v0 = null;
    }
}
