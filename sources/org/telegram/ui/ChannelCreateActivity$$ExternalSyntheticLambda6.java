package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChannelCreateActivity$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final ChannelCreateActivity f$0;

    public ChannelCreateActivity$$ExternalSyntheticLambda6(ChannelCreateActivity channelCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelCreateActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$1(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$generateLink$14(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$loadAdminedChannels$17(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadAdminedChannels$21(tLObject, tL_error);
                break;
        }
    }
}
