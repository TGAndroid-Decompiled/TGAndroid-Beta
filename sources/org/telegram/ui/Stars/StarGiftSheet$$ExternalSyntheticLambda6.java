package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;

public final class StarGiftSheet$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final StarGiftSheet f$0;
    public final long f$1;

    public StarGiftSheet$$ExternalSyntheticLambda6(StarGiftSheet starGiftSheet, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = starGiftSheet;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.openProfile(this.f$1);
                break;
            case 1:
                StarGiftSheet starGiftSheet = this.f$0;
                starGiftSheet.switchPage(1, true, null);
                if (this.f$1 > 0) {
                    StarGiftSheet$$ExternalSyntheticLambda4 starGiftSheet$$ExternalSyntheticLambda4 = starGiftSheet.tickUpgradePriceRunnable;
                    AndroidUtilities.cancelRunOnUIThread(starGiftSheet$$ExternalSyntheticLambda4);
                    AndroidUtilities.runOnUIThread(starGiftSheet$$ExternalSyntheticLambda4);
                }
                break;
            case 2:
                this.f$0.lambda$doUpgrade$134(this.f$1);
                break;
            case 3:
                this.f$0.openProfile(this.f$1);
                break;
            case 4:
                this.f$0.lambda$set$84(this.f$1);
                break;
            case 5:
                this.f$0.openProfile(this.f$1);
                break;
            case 6:
                this.f$0.lambda$set$86(this.f$1);
                break;
            case 7:
                this.f$0.openProfile(this.f$1);
                break;
            case 8:
                this.f$0.lambda$set$88(this.f$1);
                break;
            case 9:
                this.f$0.openProfile(this.f$1);
                break;
            case 10:
                this.f$0.lambda$set$75(this.f$1);
                break;
            default:
                this.f$0.openProfile(this.f$1);
                break;
        }
    }
}
