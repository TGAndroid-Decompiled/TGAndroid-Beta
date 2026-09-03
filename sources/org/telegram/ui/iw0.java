package org.telegram.ui;
public final class iw0 implements Runnable {
    public final int f35038a;
    public final PremiumPreviewFragment f35039b;

    public iw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35038a = i10;
        this.f35039b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35038a) {
            case 0:
                this.f35039b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35039b;
                premiumPreviewFragment.f31925a.postOnAnimation(new iw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35039b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
