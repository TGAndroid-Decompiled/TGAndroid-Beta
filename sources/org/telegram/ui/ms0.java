package org.telegram.ui;
public final class ms0 implements Runnable {
    public final int f48049a;
    public final PremiumPreviewFragment f48050b;

    public ms0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f48049a = i7;
        this.f48050b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f48049a) {
            case 0:
                this.f48050b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f48050b;
                premiumPreviewFragment.f41603a.postOnAnimation(new ms0(premiumPreviewFragment, 0));
                return;
            default:
                this.f48050b.getMediaDataController().R0(false);
                return;
        }
    }
}
