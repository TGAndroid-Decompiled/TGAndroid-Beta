package org.telegram.ui;
public final class ks0 implements Runnable {
    public final int f49382a;
    public final PremiumPreviewFragment f49383b;

    public ks0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f49382a = i7;
        this.f49383b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f49382a) {
            case 0:
                this.f49383b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f49383b;
                premiumPreviewFragment.f43465a.postOnAnimation(new ks0(premiumPreviewFragment, 0));
                return;
            default:
                this.f49383b.getMediaDataController().U0(false);
                return;
        }
    }
}
