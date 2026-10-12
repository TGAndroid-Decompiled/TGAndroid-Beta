package org.telegram.ui;
public final class cx0 implements Runnable {
    public final int f35084a;
    public final PremiumPreviewFragment f35085b;

    public cx0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35084a = i10;
        this.f35085b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35084a) {
            case 0:
                this.f35085b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35085b;
                premiumPreviewFragment.f32445a.postOnAnimation(new cx0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35085b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
