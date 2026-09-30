package org.telegram.ui;
public final class nw0 implements Runnable {
    public final int f35998a;
    public final PremiumPreviewFragment f35999b;

    public nw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35998a = i10;
        this.f35999b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35998a) {
            case 0:
                this.f35999b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35999b;
                premiumPreviewFragment.f31443a.postOnAnimation(new nw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35999b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
