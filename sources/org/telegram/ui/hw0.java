package org.telegram.ui;
public final class hw0 extends r51 {
    public final PremiumPreviewFragment e;

    public hw0(PremiumPreviewFragment premiumPreviewFragment, gw0 gw0Var) {
        super(gw0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f33828v0 = null;
    }
}
