package org.telegram.ui;
public final class aw0 implements Runnable {
    public final int f35435a;
    public final PremiumPreviewFragment f35436b;

    public aw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35435a = i10;
        this.f35436b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35435a) {
            case 0:
                this.f35436b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35436b;
                premiumPreviewFragment.f33497a.postOnAnimation(new aw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35436b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
