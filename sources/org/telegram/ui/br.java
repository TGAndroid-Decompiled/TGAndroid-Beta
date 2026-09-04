package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements nq {
    public final TLObject f34879a;
    public final vr f34880b;

    public br(vr vrVar, TLObject tLObject) {
        this.f34880b = vrVar;
        this.f34879a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        vr.c0(this.f34880b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f34879a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            vr.W(this.f34880b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
