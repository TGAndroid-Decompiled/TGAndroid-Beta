package org.telegram.ui;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda4 implements Runnable {
    public final int $r8$classId;
    public final PremiumPreviewFragment f$0;

    public PremiumPreviewFragment$$ExternalSyntheticLambda4(PremiumPreviewFragment premiumPreviewFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PremiumPreviewFragment premiumPreviewFragment = this.f$0;
                premiumPreviewFragment.listView.postOnAnimation(new PremiumPreviewFragment$$ExternalSyntheticLambda4(premiumPreviewFragment, 1));
                break;
            case 1:
                this.f$0.blur3_InvalidateBlur$7();
                break;
            default:
                this.f$0.getMediaDataController().loadPremiumPromo(false);
                break;
        }
    }
}
