package org.telegram.ui;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda22 implements Runnable {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;
    public final StatisticActivity f$1;
    public final TwoStepVerificationActivity f$2;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda22(ChannelMonetizationLayout channelMonetizationLayout, StatisticActivity statisticActivity, TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelMonetizationLayout;
        this.f$1 = statisticActivity;
        this.f$2 = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.balanceButton.setLoading(false);
                this.f$1.presentFragment(this.f$2);
                break;
            case 1:
                this.f$0.starsBalanceButton.setLoading(false);
                this.f$1.presentFragment(this.f$2);
                break;
            default:
                this.f$0.starsBalanceButton.setLoading(false);
                this.f$1.presentFragment(this.f$2);
                break;
        }
    }
}
