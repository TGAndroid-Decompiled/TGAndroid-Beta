package org.telegram.ui;
public final class gs0 implements Runnable {
    public final int f47508a;
    public final PremiumPreviewFragment f47509b;

    public gs0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f47508a = i7;
        this.f47509b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f47508a) {
            case 0:
                this.f47509b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f47509b;
                premiumPreviewFragment.f42975a.postOnAnimation(new gs0(premiumPreviewFragment, 0));
                return;
            default:
                this.f47509b.getMediaDataController().R0(false);
                return;
        }
    }
}
