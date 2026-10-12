package org.telegram.ui;
public final class gx0 extends i71 {
    public final PremiumPreviewFragment e;

    public gx0(PremiumPreviewFragment premiumPreviewFragment, fx0 fx0Var) {
        super(fx0Var);
        this.e = premiumPreviewFragment;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.e.f32469s0 = null;
    }
}
