package org.telegram.ui;
public final class ls0 implements Runnable {
    public final int f49670a;
    public final PremiumPreviewFragment f49671b;

    public ls0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f49670a = i7;
        this.f49671b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f49670a) {
            case 0:
                this.f49671b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f49671b;
                premiumPreviewFragment.f43430a.postOnAnimation(new ls0(premiumPreviewFragment, 0));
                return;
            default:
                this.f49671b.getMediaDataController().U0(false);
                return;
        }
    }
}
