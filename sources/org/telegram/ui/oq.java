package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oq implements aq {
    public final TLObject f41210a;
    public final jr f41211b;

    public oq(jr jrVar, TLObject tLObject) {
        this.f41211b = jrVar;
        this.f41210a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.c0(this.f41211b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f41210a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.W(this.f41211b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
