package org.telegram.ui.Components.Premium.boosts;

import org.telegram.messenger.AndroidUtilities;

public final class BoostRepository$$ExternalSyntheticLambda49 implements Runnable {
    public final int $r8$classId;
    public final BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 f$0;

    public BoostRepository$$ExternalSyntheticLambda49(BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda13, int i) {
        this.$r8$classId = i;
        this.f$0 = boostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new BoostRepository$$ExternalSyntheticLambda49(this.f$0, 1));
                break;
            default:
                this.f$0.run(null);
                break;
        }
    }
}
