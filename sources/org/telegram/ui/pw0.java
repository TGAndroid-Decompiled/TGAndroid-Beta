package org.telegram.ui;
public final class pw0 implements Runnable {
    public final int f36214a;
    public final PremiumPreviewFragment f36215b;

    public pw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f36214a = i10;
        this.f36215b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f36214a) {
            case 0:
                this.f36215b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f36215b;
                premiumPreviewFragment.f31126a.postOnAnimation(new pw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f36215b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
