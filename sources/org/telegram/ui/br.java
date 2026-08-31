package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements hq {
    public final TLObject f35579a;
    public final qr f35580b;

    public br(qr qrVar, TLObject tLObject) {
        this.f35580b = qrVar;
        this.f35579a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f35580b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35579a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f35580b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
