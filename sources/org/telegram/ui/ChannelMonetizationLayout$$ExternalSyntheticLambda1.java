package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda1 implements TwoStepVerificationActivity.TwoStepVerificationActivityDelegate {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;
    public final TwoStepVerificationActivity f$1;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda1(ChannelMonetizationLayout channelMonetizationLayout, TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelMonetizationLayout;
        this.f$1 = twoStepVerificationActivity;
    }

    @Override
    public final void didEnterPassword(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$4(this.f$1, inputCheckPasswordSRP);
                break;
            case 1:
                this.f$0.lambda$new$9(this.f$1, inputCheckPasswordSRP);
                break;
            default:
                this.f$0.lambda$new$16(this.f$1, inputCheckPasswordSRP);
                break;
        }
    }
}
