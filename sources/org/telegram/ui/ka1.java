package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ka1 implements hq {
    public final TLRPC.TL_chatChannelParticipant f35016a;
    public final boolean f35017b;
    public final boolean[] f35018c;

    public ka1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f35016a = tL_chatChannelParticipant;
        this.f35017b = z10;
        this.f35018c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f35016a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f35017b) {
            this.f35018c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
