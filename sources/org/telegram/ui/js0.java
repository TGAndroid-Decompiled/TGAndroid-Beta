package org.telegram.ui;
public final class js0 implements Runnable {
    public final int f47031a;
    public final PremiumPreviewFragment f47032b;

    public js0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f47031a = i7;
        this.f47032b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f47031a) {
            case 0:
                this.f47032b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f47032b;
                premiumPreviewFragment.f41605a.postOnAnimation(new js0(premiumPreviewFragment, 0));
                return;
            default:
                this.f47032b.getMediaDataController().R0(false);
                return;
        }
    }
}
