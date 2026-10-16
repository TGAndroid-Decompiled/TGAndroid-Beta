package org.telegram.ui;
public final class cx0 implements Runnable {
    public final int f34804a;
    public final PremiumPreviewFragment f34805b;

    public cx0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f34804a = i10;
        this.f34805b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f34804a) {
            case 0:
                this.f34805b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f34805b;
                premiumPreviewFragment.f32147a.postOnAnimation(new cx0(premiumPreviewFragment, 0));
                return;
            default:
                this.f34805b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
