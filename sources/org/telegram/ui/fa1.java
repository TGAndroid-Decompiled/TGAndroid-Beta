package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class fa1 implements hq {
    public final TLRPC.TL_chatChannelParticipant f36751a;
    public final boolean f36752b;
    public final boolean[] f36753c;

    public fa1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z4, boolean[] zArr) {
        this.f36751a = tL_chatChannelParticipant;
        this.f36752b = z4;
        this.f36753c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f36751a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f36752b) {
            this.f36753c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
