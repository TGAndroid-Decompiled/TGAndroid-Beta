package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements iq {
    public final TLObject f32162a;
    public final qr f32163b;

    public br(qr qrVar, TLObject tLObject) {
        this.f32163b = qrVar;
        this.f32162a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f32163b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32162a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qr.W(this.f32163b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
