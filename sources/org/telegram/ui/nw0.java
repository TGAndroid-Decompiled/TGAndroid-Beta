package org.telegram.ui;
public final class nw0 implements Runnable {
    public final int f36004a;
    public final PremiumPreviewFragment f36005b;

    public nw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f36004a = i10;
        this.f36005b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f36004a) {
            case 0:
                this.f36005b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f36005b;
                premiumPreviewFragment.f31441a.postOnAnimation(new nw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f36005b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
