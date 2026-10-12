package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hr implements nq {
    public final TLObject f38498a;
    public final wr f38499b;

    public hr(wr wrVar, TLObject tLObject) {
        this.f38499b = wrVar;
        this.f38498a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        wr.c0(this.f38499b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f38498a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            wr.W(this.f38499b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
