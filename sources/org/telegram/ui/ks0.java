package org.telegram.ui;
public final class ks0 implements Runnable {
    public final int f49337a;
    public final PremiumPreviewFragment f49338b;

    public ks0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f49337a = i7;
        this.f49338b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f49337a) {
            case 0:
                this.f49338b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f49338b;
                premiumPreviewFragment.f43420a.postOnAnimation(new ks0(premiumPreviewFragment, 0));
                return;
            default:
                this.f49338b.getMediaDataController().U0(false);
                return;
        }
    }
}
