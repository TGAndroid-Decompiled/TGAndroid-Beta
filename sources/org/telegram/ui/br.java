package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements nq {
    public final TLObject f36245a;
    public final wr f36246b;

    public br(wr wrVar, TLObject tLObject) {
        this.f36246b = wrVar;
        this.f36245a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        wr.c0(this.f36246b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f36245a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            wr.W(this.f36246b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
