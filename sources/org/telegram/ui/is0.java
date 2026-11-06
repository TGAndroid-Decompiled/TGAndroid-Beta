package org.telegram.ui;
public final class is0 implements Runnable {
    public final int f46715a;
    public final PremiumPreviewFragment f46716b;

    public is0(PremiumPreviewFragment premiumPreviewFragment, int i7) {
        this.f46715a = i7;
        this.f46716b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f46715a) {
            case 0:
                this.f46716b.o0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f46716b;
                premiumPreviewFragment.f41577a.postOnAnimation(new is0(premiumPreviewFragment, 0));
                return;
            default:
                this.f46716b.getMediaDataController().R0(false);
                return;
        }
    }
}
