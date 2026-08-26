package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChannelAdminLogActivity$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final ChannelAdminLogActivity f$0;

    public ChannelAdminLogActivity$$ExternalSyntheticLambda6(ChannelAdminLogActivity channelAdminLogActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelAdminLogActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadAntispamUser$23(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$reloadLastMessages$1(tLObject, tL_error);
                break;
            case 2:
                this.f$0.lambda$processSelectedOption$18(tLObject, tL_error);
                break;
            case 3:
                this.f$0.lambda$loadAdmins$22(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadMessages$4(tLObject, tL_error);
                break;
        }
    }
}
