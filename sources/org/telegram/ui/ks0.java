package org.telegram.ui;
public final class ks0 implements Runnable {
    public final int f49378a;
    public final PremiumPreviewFragment f49379b;

    public ks0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f49378a = i7;
        this.f49379b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f49378a) {
            case 0:
                this.f49379b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f49379b;
                premiumPreviewFragment.f43461a.postOnAnimation(new ks0(premiumPreviewFragment, 0));
                return;
            default:
                this.f49379b.getMediaDataController().U0(false);
                return;
        }
    }
}
