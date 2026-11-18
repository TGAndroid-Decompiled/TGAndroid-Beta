package org.telegram.ui;
public final class ks0 implements Runnable {
    public final int f49331a;
    public final PremiumPreviewFragment f49332b;

    public ks0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f49331a = i7;
        this.f49332b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f49331a) {
            case 0:
                this.f49332b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f49332b;
                premiumPreviewFragment.f43420a.postOnAnimation(new ks0(premiumPreviewFragment, 0));
                return;
            default:
                this.f49332b.getMediaDataController().U0(false);
                return;
        }
    }
}
