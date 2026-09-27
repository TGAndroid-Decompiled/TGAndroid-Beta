package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cr implements iq {
    public final TLObject f32784a;
    public final qr f32785b;

    public cr(qr qrVar, TLObject tLObject) {
        this.f32785b = qrVar;
        this.f32784a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f32785b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32784a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f32785b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
