package org.telegram.ui;
public final class ax0 extends b71 {
    public final PremiumPreviewFragment f36072e;

    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.f36072e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f36072e.f34150s0 = null;
    }
}
