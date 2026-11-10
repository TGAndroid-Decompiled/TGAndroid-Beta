package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bq implements jp {
    public final TLObject f44106a;
    public final rq f44107b;

    public bq(rq rqVar, TLObject tLObject) {
        this.f44107b = rqVar;
        this.f44106a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.f44107b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44106a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rq.b0(this.f44107b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
