package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mq implements yp {
    public final TLObject f39323a;
    public final hr f39324b;

    public mq(hr hrVar, TLObject tLObject) {
        this.f39324b = hrVar;
        this.f39323a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        hr.c0(this.f39324b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f39323a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            hr.W(this.f39324b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
