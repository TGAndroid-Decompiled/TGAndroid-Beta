package org.telegram.ui;
public final class iw0 implements Runnable {
    public final int f40359a;
    public final PremiumPreviewFragment f40360b;

    public iw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f40359a = i10;
        this.f40360b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f40359a) {
            case 0:
                this.f40360b.k0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f40360b;
                premiumPreviewFragment.f35862a.postOnAnimation(new iw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f40360b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
