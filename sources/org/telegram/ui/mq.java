package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mq implements yp {
    public final TLObject f40502a;
    public final jr f40503b;

    public mq(jr jrVar, TLObject tLObject) {
        this.f40503b = jrVar;
        this.f40502a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        jr.b0(this.f40503b, user);
    }

    @Override
    public final void b(int i9, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f40502a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            jr.V(this.f40503b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
