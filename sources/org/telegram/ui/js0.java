package org.telegram.ui;
public final class js0 implements Runnable {
    public final int f47033a;
    public final PremiumPreviewFragment f47034b;

    public js0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f47033a = i7;
        this.f47034b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f47033a) {
            case 0:
                this.f47034b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f47034b;
                premiumPreviewFragment.f41601a.postOnAnimation(new js0(premiumPreviewFragment, 0));
                return;
            default:
                this.f47034b.getMediaDataController().R0(false);
                return;
        }
    }
}
