package org.telegram.ui;
public final class js0 implements Runnable {
    public final int f47034a;
    public final PremiumPreviewFragment f47035b;

    public js0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f47034a = i7;
        this.f47035b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f47034a) {
            case 0:
                this.f47035b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f47035b;
                premiumPreviewFragment.f41602a.postOnAnimation(new js0(premiumPreviewFragment, 0));
                return;
            default:
                this.f47035b.getMediaDataController().R0(false);
                return;
        }
    }
}
