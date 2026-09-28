package org.telegram.ui;
public final class nw0 implements Runnable {
    public final int f36005a;
    public final PremiumPreviewFragment f36006b;

    public nw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f36005a = i10;
        this.f36006b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f36005a) {
            case 0:
                this.f36006b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f36006b;
                premiumPreviewFragment.f31442a.postOnAnimation(new nw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f36006b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
