package org.telegram.ui;
public final class ls0 implements Runnable {
    public final int f47674a;
    public final PremiumPreviewFragment f47675b;

    public ls0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f47674a = i7;
        this.f47675b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f47674a) {
            case 0:
                this.f47675b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f47675b;
                premiumPreviewFragment.f41612a.postOnAnimation(new ls0(premiumPreviewFragment, 0));
                return;
            default:
                this.f47675b.getMediaDataController().R0(false);
                return;
        }
    }
}
