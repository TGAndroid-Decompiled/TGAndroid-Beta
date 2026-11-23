package org.telegram.ui;
public final class js0 implements Runnable {
    public final int f49202a;
    public final PremiumPreviewFragment f49203b;

    public js0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f49202a = i7;
        this.f49203b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f49202a) {
            case 0:
                this.f49203b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f49203b;
                premiumPreviewFragment.f43546a.postOnAnimation(new js0(premiumPreviewFragment, 0));
                return;
            default:
                this.f49203b.getMediaDataController().U0(false);
                return;
        }
    }
}
