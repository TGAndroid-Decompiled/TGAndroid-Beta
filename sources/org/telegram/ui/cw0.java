package org.telegram.ui;
public final class cw0 implements Runnable {
    public final int f35990a;
    public final PremiumPreviewFragment f35991b;

    public cw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35990a = i10;
        this.f35991b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35990a) {
            case 0:
                this.f35991b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35991b;
                premiumPreviewFragment.f33485a.postOnAnimation(new cw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35991b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
