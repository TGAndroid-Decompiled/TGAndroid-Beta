package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hr implements nq {
    public final TLObject f37095a;
    public final vr f37096b;

    public hr(vr vrVar, TLObject tLObject) {
        this.f37096b = vrVar;
        this.f37095a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        vr.c0(this.f37096b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f37095a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            vr.W(this.f37096b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
