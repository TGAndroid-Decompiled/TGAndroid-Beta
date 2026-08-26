package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChannelMonetizationLayout$$ExternalSyntheticLambda29 implements RequestDelegate {
    public final int $r8$classId;
    public final ChannelMonetizationLayout f$0;

    public ChannelMonetizationLayout$$ExternalSyntheticLambda29(ChannelMonetizationLayout channelMonetizationLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = channelMonetizationLayout;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$sendCpmUpdate$37(tLObject, tL_error);
                break;
            case 1:
                this.f$0.lambda$initLevel$33(tLObject, tL_error);
                break;
            default:
                this.f$0.lambda$loadStarsStats$27(tLObject, tL_error);
                break;
        }
    }
}
