package org.telegram.ui;
public final class nw0 implements Runnable {
    public final int f35980a;
    public final PremiumPreviewFragment f35981b;

    public nw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35980a = i10;
        this.f35981b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35980a) {
            case 0:
                this.f35981b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35981b;
                premiumPreviewFragment.f31427a.postOnAnimation(new nw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35981b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
