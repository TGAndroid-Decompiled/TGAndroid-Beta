package org.telegram.ui;
public final class os0 extends j11 {
    public final PremiumPreviewFragment f50648e;

    public os0(PremiumPreviewFragment premiumPreviewFragment, ns0 ns0Var) {
        super(ns0Var);
        this.f50648e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f50648e.f43489v0 = null;
    }
}
