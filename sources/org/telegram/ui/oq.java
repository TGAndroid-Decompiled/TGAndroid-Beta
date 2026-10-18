package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oq implements aq {
    public final TLObject f39883a;
    public final jr f39884b;

    public oq(jr jrVar, TLObject tLObject) {
        this.f39884b = jrVar;
        this.f39883a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f39884b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f39883a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.W(this.f39884b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
