package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ka1 implements hq {
    public final TLRPC.TL_chatChannelParticipant f35106a;
    public final boolean f35107b;
    public final boolean[] f35108c;

    public ka1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f35106a = tL_chatChannelParticipant;
        this.f35107b = z10;
        this.f35108c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f35106a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f35107b) {
            this.f35108c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
