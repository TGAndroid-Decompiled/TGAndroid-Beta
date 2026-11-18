package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dq implements kp {
    public final TLObject f47035a;
    public final rq f47036b;

    public dq(rq rqVar, TLObject tLObject) {
        this.f47036b = rqVar;
        this.f47035a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.f47036b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f47035a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rq.b0(this.f47036b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
