package org.telegram.ui;
public final class os0 extends i11 {
    public final PremiumPreviewFragment f50615e;

    public os0(PremiumPreviewFragment premiumPreviewFragment, ns0 ns0Var) {
        super(ns0Var);
        this.f50615e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f50615e.f43448v0 = null;
    }
}
