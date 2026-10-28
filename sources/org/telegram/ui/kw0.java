package org.telegram.ui;
public final class kw0 implements Runnable {
    public final int f40926a;
    public final PremiumPreviewFragment f40927b;

    public kw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f40926a = i10;
        this.f40927b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f40926a) {
            case 0:
                this.f40927b.k0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f40927b;
                premiumPreviewFragment.f35889a.postOnAnimation(new kw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f40927b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
