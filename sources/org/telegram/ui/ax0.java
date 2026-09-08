package org.telegram.ui;
public final class ax0 extends a71 {
    public final PremiumPreviewFragment f34590e;

    public ax0(PremiumPreviewFragment premiumPreviewFragment, zw0 zw0Var) {
        super(zw0Var);
        this.f34590e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f34590e.f33822s0 = null;
    }
}
