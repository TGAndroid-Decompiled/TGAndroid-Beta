package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mq implements yp {
    public final TLObject f39332a;
    public final hr f39333b;

    public mq(hr hrVar, TLObject tLObject) {
        this.f39333b = hrVar;
        this.f39332a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        hr.c0(this.f39333b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f39332a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            hr.W(this.f39333b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
