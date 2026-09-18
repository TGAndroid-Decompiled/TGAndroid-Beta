package org.telegram.ui;
public final class ax0 extends x61 {
    public final PremiumPreviewFragment e;

    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f31423s0 = null;
    }
}
