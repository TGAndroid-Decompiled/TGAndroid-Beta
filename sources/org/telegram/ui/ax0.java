package org.telegram.ui;
public final class ax0 extends b71 {
    public final PremiumPreviewFragment f36070e;

    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.f36070e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f36070e.f34150s0 = null;
    }
}
