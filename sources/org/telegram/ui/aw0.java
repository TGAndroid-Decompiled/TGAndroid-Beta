package org.telegram.ui;
public final class aw0 implements Runnable {
    public final int f35445a;
    public final PremiumPreviewFragment f35446b;

    public aw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35445a = i10;
        this.f35446b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35445a) {
            case 0:
                this.f35446b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35446b;
                premiumPreviewFragment.f33491a.postOnAnimation(new aw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35446b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
