package org.telegram.ui;
public final class aw0 implements Runnable {
    public final int f35439a;
    public final PremiumPreviewFragment f35440b;

    public aw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f35439a = i10;
        this.f35440b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f35439a) {
            case 0:
                this.f35440b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f35440b;
                premiumPreviewFragment.f33501a.postOnAnimation(new aw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f35440b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
