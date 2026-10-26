package org.telegram.ui;
public final class iw0 implements Runnable {
    public final int f40362a;
    public final PremiumPreviewFragment f40363b;

    public iw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f40362a = i10;
        this.f40363b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f40362a) {
            case 0:
                this.f40363b.k0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f40363b;
                premiumPreviewFragment.f35865a.postOnAnimation(new iw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f40363b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
