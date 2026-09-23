package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cr implements iq {
    public final TLObject f32390a;
    public final qr f32391b;

    public cr(qr qrVar, TLObject tLObject) {
        this.f32391b = qrVar;
        this.f32390a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f32391b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32390a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f32391b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
