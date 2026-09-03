package org.telegram.ui;
public final class iw0 implements Runnable {
    public final int f37790a;
    public final PremiumPreviewFragment f37791b;

    public iw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f37790a = i10;
        this.f37791b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f37790a) {
            case 0:
                this.f37791b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f37791b;
                premiumPreviewFragment.f34480a.postOnAnimation(new iw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f37791b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
