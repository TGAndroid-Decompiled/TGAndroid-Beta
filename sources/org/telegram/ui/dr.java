package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dr implements jq {
    public final TLObject f35825a;
    public final rr f35826b;

    public dr(rr rrVar, TLObject tLObject) {
        this.f35826b = rrVar;
        this.f35825a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f35826b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35825a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rr.U(this.f35826b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
