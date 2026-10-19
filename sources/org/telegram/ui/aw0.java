package org.telegram.ui;
public final class aw0 implements Runnable {
    public final int f35429a;
    public final PremiumPreviewFragment f35430b;

    public aw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35429a = i10;
        this.f35430b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35429a) {
            case 0:
                this.f35430b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35430b;
                premiumPreviewFragment.f33491a.postOnAnimation(new aw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35430b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
