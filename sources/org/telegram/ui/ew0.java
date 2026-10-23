package org.telegram.ui;
public final class ew0 implements Runnable {
    public final int f37029a;
    public final PremiumPreviewFragment f37030b;

    public ew0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f37029a = i10;
        this.f37030b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f37029a) {
            case 0:
                this.f37030b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f37030b;
                premiumPreviewFragment.f33799a.postOnAnimation(new ew0(premiumPreviewFragment, 0));
                return;
            default:
                this.f37030b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
