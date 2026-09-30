package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar implements hq {
    public final TLObject f32218a;
    public final pr f32219b;

    public ar(pr prVar, TLObject tLObject) {
        this.f32219b = prVar;
        this.f32218a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.f32219b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32218a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.W(this.f32219b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
