package org.telegram.ui;
public final class aw0 implements Runnable {
    public final int f35440a;
    public final PremiumPreviewFragment f35441b;

    public aw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35440a = i10;
        this.f35441b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35440a) {
            case 0:
                this.f35441b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35441b;
                premiumPreviewFragment.f33502a.postOnAnimation(new aw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35441b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
