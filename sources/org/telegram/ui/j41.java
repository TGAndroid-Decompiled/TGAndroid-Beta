package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class j41 implements fp {
    public final TLRPC.TL_chatChannelParticipant f46493a;
    public final boolean f46494b;
    public final boolean[] f46495c;

    public j41(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f46493a = tL_chatChannelParticipant;
        this.f46494b = z10;
        this.f46495c = zArr;
    }

    @Override
    public final void b(int i3, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f46493a;
        if (i3 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f46494b) {
            this.f46495c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
