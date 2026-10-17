package org.telegram.ui;
public final class cw0 implements Runnable {
    public final int f35997a;
    public final PremiumPreviewFragment f35998b;

    public cw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35997a = i10;
        this.f35998b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35997a) {
            case 0:
                this.f35998b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35998b;
                premiumPreviewFragment.f33485a.postOnAnimation(new cw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35998b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
