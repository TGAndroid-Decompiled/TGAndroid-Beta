package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hr implements nq {
    public final TLObject f37122a;
    public final vr f37123b;

    public hr(vr vrVar, TLObject tLObject) {
        this.f37123b = vrVar;
        this.f37122a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        vr.c0(this.f37123b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f37122a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            vr.W(this.f37123b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
