package org.telegram.ui;
public final class nw0 implements Runnable {
    public final int f36003a;
    public final PremiumPreviewFragment f36004b;

    public nw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f36003a = i10;
        this.f36004b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f36003a) {
            case 0:
                this.f36004b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f36004b;
                premiumPreviewFragment.f31440a.postOnAnimation(new nw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f36004b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
