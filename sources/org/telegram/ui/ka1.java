package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ka1 implements hq {
    public final TLRPC.TL_chatChannelParticipant f35017a;
    public final boolean f35018b;
    public final boolean[] f35019c;

    public ka1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f35017a = tL_chatChannelParticipant;
        this.f35018b = z10;
        this.f35019c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f35017a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f35018b) {
            this.f35019c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
