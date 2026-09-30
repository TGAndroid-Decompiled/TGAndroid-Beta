package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ka1 implements hq {
    public final TLRPC.TL_chatChannelParticipant f35019a;
    public final boolean f35020b;
    public final boolean[] f35021c;

    public ka1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f35019a = tL_chatChannelParticipant;
        this.f35020b = z10;
        this.f35021c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f35019a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f35020b) {
            this.f35021c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
