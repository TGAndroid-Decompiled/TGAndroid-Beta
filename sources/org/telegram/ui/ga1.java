package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class ga1 implements iq {
    public final TLRPC.TL_chatChannelParticipant f34397a;
    public final boolean f34398b;
    public final boolean[] f34399c;

    public ga1(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z4, boolean[] zArr) {
        this.f34397a = tL_chatChannelParticipant;
        this.f34398b = z4;
        this.f34399c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f34397a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f34398b) {
            this.f34399c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
