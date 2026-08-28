package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class k91 implements yp {
    public final TLRPC.TL_chatChannelParticipant f39777a;
    public final boolean f39778b;
    public final boolean[] f39779c;

    public k91(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f39777a = tL_chatChannelParticipant;
        this.f39778b = z10;
        this.f39779c = zArr;
    }

    @Override
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f39777a;
        if (i9 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f39778b) {
            this.f39779c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
