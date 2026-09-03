package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements iq {
    public final TLObject f32937a;
    public final rr f32938b;

    public br(rr rrVar, TLObject tLObject) {
        this.f32938b = rrVar;
        this.f32937a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f32938b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32937a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rr.W(this.f32938b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
