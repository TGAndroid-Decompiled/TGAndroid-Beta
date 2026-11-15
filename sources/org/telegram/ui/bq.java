package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bq implements jp {
    public final TLObject f45809a;
    public final qq f45810b;

    public bq(qq qqVar, TLObject tLObject) {
        this.f45810b = qqVar;
        this.f45809a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qq.h0(this.f45810b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f45809a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qq.b0(this.f45810b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
