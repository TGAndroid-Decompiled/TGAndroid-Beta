package org.telegram.ui;
public final class dw0 implements Runnable {
    public final int f36321a;
    public final PremiumPreviewFragment f36322b;

    public dw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f36321a = i10;
        this.f36322b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f36321a) {
            case 0:
                this.f36322b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f36322b;
                premiumPreviewFragment.f34480a.postOnAnimation(new dw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f36322b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
