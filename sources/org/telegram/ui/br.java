package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements hq {
    public final TLObject f35590a;
    public final qr f35591b;

    public br(qr qrVar, TLObject tLObject) {
        this.f35591b = qrVar;
        this.f35590a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f35591b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35590a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f35591b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
