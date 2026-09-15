package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class qa1 implements mq {
    public final TLRPC.TL_chatChannelParticipant f36829a;
    public final boolean f36830b;
    public final boolean[] f36831c;

    public qa1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f36829a = tL_chatChannelParticipant;
        this.f36830b = z10;
        this.f36831c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f36829a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f36830b) {
            this.f36831c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
