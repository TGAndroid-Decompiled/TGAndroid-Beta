package org.telegram.ui;

public final class ChannelAdminLogActivity$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final ChannelAdminLogActivity f$0;

    public ChannelAdminLogActivity$$ExternalSyntheticLambda11(ChannelAdminLogActivity channelAdminLogActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelAdminLogActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.invalidateMergedVisibleBlurredPositionsAndSourcesPositions();
                break;
            case 1:
                this.f$0.lambda$startMessageUnselect$25();
                break;
            case 2:
                this.f$0.lambda$processSelectedOption$20();
                break;
            default:
                this.f$0.lambda$loadMessages$2();
                break;
        }
    }
}
