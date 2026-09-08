package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements nq {
    public final TLObject f36776a;
    public final vr f36777b;

    public gr(vr vrVar, TLObject tLObject) {
        this.f36777b = vrVar;
        this.f36776a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        vr.c0(this.f36777b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f36776a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            vr.W(this.f36777b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
