package org.telegram.ui.Components.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RLottieImageView;

public final class RateCallLayout$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final RateCallLayout f$0;
    public final RLottieImageView f$1;

    public RateCallLayout$$ExternalSyntheticLambda2(RateCallLayout rateCallLayout, RLottieImageView rLottieImageView, int i) {
        this.$r8$classId = i;
        this.f$0 = rateCallLayout;
        this.f$1 = rLottieImageView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                RateCallLayout rateCallLayout = this.f$0;
                rateCallLayout.getClass();
                AndroidUtilities.runOnUIThread(new RateCallLayout$$ExternalSyntheticLambda2(rateCallLayout, this.f$1, 1));
                break;
            default:
                this.f$0.removeView(this.f$1);
                break;
        }
    }
}
