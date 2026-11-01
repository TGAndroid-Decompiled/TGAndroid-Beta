package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class k61 implements fq {
    public final TLRPC.TL_chatChannelParticipant f38657a;
    public final boolean f38658b;
    public final boolean[] f38659c;

    public k61(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f38657a = tL_chatChannelParticipant;
        this.f38658b = z10;
        this.f38659c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f38657a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f38658b) {
            this.f38659c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
