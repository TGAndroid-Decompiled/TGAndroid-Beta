package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class ChannelAdminLogActivity$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final ChannelAdminLogActivity f$0;
    public final TLRPC.TL_channels_adminLogResults f$1;

    public ChannelAdminLogActivity$$ExternalSyntheticLambda13(ChannelAdminLogActivity channelAdminLogActivity, TLRPC.TL_channels_adminLogResults tL_channels_adminLogResults, int i) {
        this.$r8$classId = i;
        this.f$0 = channelAdminLogActivity;
        this.f$1 = tL_channels_adminLogResults;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadMessages$3(this.f$1);
                break;
            default:
                this.f$0.lambda$reloadLastMessages$0(this.f$1);
                break;
        }
    }
}
