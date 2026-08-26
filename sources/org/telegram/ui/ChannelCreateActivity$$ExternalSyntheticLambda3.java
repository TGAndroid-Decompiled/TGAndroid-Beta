package org.telegram.ui;

public final class ChannelCreateActivity$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final ChannelCreateActivity f$0;

    public ChannelCreateActivity$$ExternalSyntheticLambda3(ChannelCreateActivity channelCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelCreateActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadAdminedChannels$16();
                break;
            case 1:
                this.f$0.lambda$showPremiumIncreaseLimitDialog$25();
                break;
            case 2:
                this.f$0.lambda$createView$6();
                break;
            default:
                this.f$0.lambda$new$3();
                break;
        }
    }
}
