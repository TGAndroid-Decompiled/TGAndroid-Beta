package org.telegram.ui;
public final class gs0 implements Runnable {
    public final int f47518a;
    public final PremiumPreviewFragment f47519b;

    public gs0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f47518a = i7;
        this.f47519b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f47518a) {
            case 0:
                this.f47519b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f47519b;
                premiumPreviewFragment.f42975a.postOnAnimation(new gs0(premiumPreviewFragment, 0));
                return;
            default:
                this.f47519b.getMediaDataController().R0(false);
                return;
        }
    }
}
