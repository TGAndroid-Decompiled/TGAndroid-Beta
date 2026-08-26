package org.telegram.ui;

import org.telegram.ui.ActionBar.BaseFragment;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;
    public final BaseFragment f$1;
    public final TwoStepVerificationActivity f$2;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda2(ChannelMonetizationLayout channelMonetizationLayout, BaseFragment baseFragment, TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelMonetizationLayout;
        this.f$1 = baseFragment;
        this.f$2 = twoStepVerificationActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$5(this.f$1, this.f$2);
                break;
            case 1:
                this.f$0.lambda$new$17(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$new$10(this.f$1, this.f$2);
                break;
        }
    }
}
