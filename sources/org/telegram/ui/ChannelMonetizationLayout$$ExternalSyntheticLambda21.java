package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda21 implements TwoStepVerificationActivity.TwoStepVerificationActivityDelegate {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;
    public final TwoStepVerificationActivity f$1;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda21(ChannelMonetizationLayout channelMonetizationLayout, TwoStepVerificationActivity twoStepVerificationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelMonetizationLayout;
        this.f$1 = twoStepVerificationActivity;
    }

    @Override
    public final void didEnterPassword(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.initWithdraw(false, tL_inputCheckPasswordSRP, this.f$1);
                break;
            case 1:
                this.f$0.initWithdraw(true, tL_inputCheckPasswordSRP, this.f$1);
                break;
            default:
                this.f$0.initWithdraw(true, tL_inputCheckPasswordSRP, this.f$1);
                break;
        }
    }
}
