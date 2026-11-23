package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cq implements kp {
    public final TLObject f46652a;
    public final rq f46653b;

    public cq(rq rqVar, TLObject tLObject) {
        this.f46653b = rqVar;
        this.f46652a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.f46653b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f46652a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rq.b0(this.f46653b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
