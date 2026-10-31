package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class m61 implements fq {
    public final TLRPC.TL_chatChannelParticipant f39490a;
    public final boolean f39491b;
    public final boolean[] f39492c;

    public m61(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f39490a = tL_chatChannelParticipant;
        this.f39491b = z10;
        this.f39492c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f39490a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f39491b) {
            this.f39492c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
