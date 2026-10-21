package org.telegram.ui;
public final class aw0 implements Runnable {
    public final int f35436a;
    public final PremiumPreviewFragment f35437b;

    public aw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35436a = i10;
        this.f35437b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35436a) {
            case 0:
                this.f35437b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35437b;
                premiumPreviewFragment.f33498a.postOnAnimation(new aw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35437b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
