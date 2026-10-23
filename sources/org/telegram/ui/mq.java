package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mq implements yp {
    public final TLObject f39333a;
    public final hr f39334b;

    public mq(hr hrVar, TLObject tLObject) {
        this.f39334b = hrVar;
        this.f39333a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        hr.c0(this.f39334b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f39333a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            hr.W(this.f39334b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
