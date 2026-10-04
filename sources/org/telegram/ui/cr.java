package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cr implements jq {
    public final TLObject f35535a;
    public final rr f35536b;

    public cr(rr rrVar, TLObject tLObject) {
        this.f35536b = rrVar;
        this.f35535a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f35536b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35535a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rr.U(this.f35536b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
