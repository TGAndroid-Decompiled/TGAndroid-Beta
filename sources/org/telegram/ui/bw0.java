package org.telegram.ui;
public final class bw0 implements Runnable {
    public final int f33039a;
    public final PremiumPreviewFragment f33040b;

    public bw0(PremiumPreviewFragment premiumPreviewFragment, int i10) {
        this.f33039a = i10;
        this.f33040b = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.f33039a) {
            case 0:
                this.f33040b.j0();
                return;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = this.f33040b;
                premiumPreviewFragment.f31951a.postOnAnimation(new bw0(premiumPreviewFragment, 0));
                return;
            default:
                this.f33040b.getMediaDataController().loadPremiumPromo(false);
                return;
        }
    }
}
