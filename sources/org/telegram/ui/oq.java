package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oq implements aq {
    public final TLObject f40240a;
    public final jr f40241b;

    public oq(jr jrVar, TLObject tLObject) {
        this.f40241b = jrVar;
        this.f40240a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f40241b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f40240a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.W(this.f40241b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
