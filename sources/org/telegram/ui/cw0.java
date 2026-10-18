package org.telegram.ui;
public final class cw0 implements Runnable {
    public final int f36018a;
    public final PremiumPreviewFragment f36019b;

    public cw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f36018a = i10;
        this.f36019b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f36018a) {
            case 0:
                this.f36019b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f36019b;
                premiumPreviewFragment.f33492a.postOnAnimation(new cw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f36019b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
