package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class er implements kq {
    public final TLObject f37312a;
    public final tr f37313b;

    public er(tr trVar, TLObject tLObject) {
        this.f37313b = trVar;
        this.f37312a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        tr.c0(this.f37313b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f37312a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            tr.W(this.f37313b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
