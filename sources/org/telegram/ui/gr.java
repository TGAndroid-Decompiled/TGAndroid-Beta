package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements nq {
    public final TLObject f38120a;
    public final wr f38121b;

    public gr(wr wrVar, TLObject tLObject) {
        this.f38121b = wrVar;
        this.f38120a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        wr.c0(this.f38121b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f38120a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            wr.W(this.f38121b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
