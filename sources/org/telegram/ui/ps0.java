package org.telegram.ui;
public final class ps0 extends i11 {
    public final PremiumPreviewFragment f50905e;

    public ps0(PremiumPreviewFragment premiumPreviewFragment, os0 os0Var) {
        super(os0Var);
        this.f50905e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f50905e.f43458v0 = null;
    }
}
