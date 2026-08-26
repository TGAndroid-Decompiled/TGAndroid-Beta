package org.telegram.ui;

public final class PremiumPreviewFragment$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final PremiumPreviewFragment f$0;

    public PremiumPreviewFragment$$ExternalSyntheticLambda13(PremiumPreviewFragment premiumPreviewFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = premiumPreviewFragment;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.blur3_InvalidateBlur();
                break;
            case 1:
                this.f$0.lambda$createView$1();
                break;
            default:
                this.f$0.lambda$createView$6();
                break;
        }
    }
}
