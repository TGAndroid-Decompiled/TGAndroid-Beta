package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements iq {
    public final TLObject f32416a;
    public final qr f32417b;

    public br(qr qrVar, TLObject tLObject) {
        this.f32417b = qrVar;
        this.f32416a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f32417b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32416a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f32417b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
