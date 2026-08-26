package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ChannelCreateActivity$$ExternalSyntheticLambda2 implements RequestDelegate {
    public final int $r8$classId;
    public final ChannelCreateActivity f$0;

    public ChannelCreateActivity$$ExternalSyntheticLambda2(ChannelCreateActivity channelCreateActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = channelCreateActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ChannelCreateActivity channelCreateActivity = this.f$0;
                channelCreateActivity.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(12, channelCreateActivity, tL_error));
                break;
            case 1:
                ChannelCreateActivity channelCreateActivity2 = this.f$0;
                channelCreateActivity2.getClass();
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda7(13, channelCreateActivity2, tLObject));
                break;
            case 2:
                ChannelCreateActivity channelCreateActivity3 = this.f$0;
                channelCreateActivity3.getClass();
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ChannelCreateActivity$$ExternalSyntheticLambda1(channelCreateActivity3, 3));
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda102(this.f$0, tL_error, tLObject, 10));
                break;
        }
    }
}
