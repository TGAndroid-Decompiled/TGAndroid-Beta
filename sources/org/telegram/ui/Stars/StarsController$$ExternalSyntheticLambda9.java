package org.telegram.ui.Stars;

import org.telegram.messenger.AndroidUtilities;

public final class StarsController$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4 f$0;

    public StarsController$$ExternalSyntheticLambda9(StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4 starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4, int i) {
        this.$r8$classId = i;
        this.f$0 = starsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.run(Boolean.FALSE, null);
                break;
            case 1:
                this.f$0.run(Boolean.FALSE, "PRODUCT_NOT_FOUND");
                break;
            case 2:
                this.f$0.run(Boolean.FALSE, "PRODUCT_NO_ONETIME_OFFER_DETAILS");
                break;
            default:
                AndroidUtilities.runOnUIThread(new StarsController$$ExternalSyntheticLambda9(this.f$0, 0));
                break;
        }
    }
}
