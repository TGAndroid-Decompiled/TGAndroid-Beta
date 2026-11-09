package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bq implements jp {
    public final TLObject f44098a;
    public final qq f44099b;

    public bq(qq qqVar, TLObject tLObject) {
        this.f44099b = qqVar;
        this.f44098a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qq.h0(this.f44099b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44098a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qq.b0(this.f44099b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
