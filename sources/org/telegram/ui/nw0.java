package org.telegram.ui;
public final class nw0 implements Runnable {
    public final int f36142a;
    public final PremiumPreviewFragment f36143b;

    public nw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f36142a = i10;
        this.f36143b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f36142a) {
            case 0:
                this.f36143b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f36143b;
                premiumPreviewFragment.f31515a.postOnAnimation(new nw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f36143b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
