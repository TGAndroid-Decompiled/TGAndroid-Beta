package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cq implements kp {
    public final TLObject f46849a;
    public final rq f46850b;

    public cq(rq rqVar, TLObject tLObject) {
        this.f46850b = rqVar;
        this.f46849a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.f46850b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f46849a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rq.b0(this.f46850b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
