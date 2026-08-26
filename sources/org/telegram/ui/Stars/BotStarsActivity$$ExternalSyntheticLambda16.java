package org.telegram.ui.Stars;

import org.telegram.ui.TwoStepVerificationActivity;

public final class BotStarsActivity$$ExternalSyntheticLambda16 implements Runnable {
    public final int $r8$classId;
    public final BotStarsActivity f$0;
    public final TwoStepVerificationActivity f$1;

    public BotStarsActivity$$ExternalSyntheticLambda16(BotStarsActivity botStarsActivity, TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = botStarsActivity;
        this.f$1 = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                BotStarsActivity botStarsActivity = this.f$0;
                botStarsActivity.balanceButton.setLoading(false);
                botStarsActivity.presentFragment(this.f$1);
                break;
            default:
                BotStarsActivity botStarsActivity2 = this.f$0;
                botStarsActivity2.tonBalanceButton.setLoading(false);
                botStarsActivity2.presentFragment(this.f$1);
                break;
        }
    }
}
