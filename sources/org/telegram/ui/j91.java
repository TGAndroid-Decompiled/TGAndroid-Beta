package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class j91 implements aq {
    public final TLRPC.TL_chatChannelParticipant f38100a;
    public final boolean f38101b;
    public final boolean[] f38102c;

    public j91(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f38100a = tL_chatChannelParticipant;
        this.f38101b = z10;
        this.f38102c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f38100a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f38101b) {
            this.f38102c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
