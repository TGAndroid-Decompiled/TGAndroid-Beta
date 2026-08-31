package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar implements hq {
    public final TLObject f35233a;
    public final qr f35234b;

    public ar(qr qrVar, TLObject tLObject) {
        this.f35234b = qrVar;
        this.f35233a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f35234b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35233a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f35234b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
