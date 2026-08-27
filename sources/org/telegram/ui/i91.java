package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

public final class i91 implements aq {

    public final TLRPC.TL_chatChannelParticipant f39012a;

    public final boolean f39013b;

    public final boolean[] f39014c;

    public i91(TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant, boolean z10, boolean[] zArr) {
        this.f39012a = tL_chatChannelParticipant;
        this.f39013b = z10;
        this.f39014c = zArr;
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = this.f39012a;
        if (i10 == 0) {
            TLRPC.ChannelParticipant channelParticipant = tL_chatChannelParticipant.channelParticipant;
            channelParticipant.admin_rights = null;
            channelParticipant.rank = "";
        } else {
            TLRPC.ChannelParticipant channelParticipant2 = tL_chatChannelParticipant.channelParticipant;
            channelParticipant2.admin_rights = tL_chatAdminRights;
            channelParticipant2.rank = str;
            if (this.f39013b) {
                this.f39014c[0] = true;
            }
        }
    }

    @Override
    public final void a(TLRPC.User user) {
    }
}
