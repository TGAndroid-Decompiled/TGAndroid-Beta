package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
public final class j91 implements aq {
    public final TLRPC.TL_chatChannelParticipant f38116a;
    public final boolean f38117b;
    public final boolean[] f38118c;

    public j91(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f38116a = tL_chatChannelParticipant;
        this.f38117b = z10;
        this.f38118c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f38116a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
            return;
        }
        TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
        channelParticipant2.admin_rights = tL_chatAdminRights;
        channelParticipant2.rank = str;
        if (this.f38117b) {
            this.f38118c[0] = true;
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
