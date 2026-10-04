package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dr implements jq {
    public final TLObject f35831a;
    public final rr f35832b;

    public dr(rr rrVar, TLObject tLObject) {
        this.f35832b = rrVar;
        this.f35831a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f35832b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35831a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rr.U(this.f35832b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
