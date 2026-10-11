package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dr implements kq {
    public final TLObject f37104a;
    public final sr f37105b;

    public dr(sr srVar, TLObject tLObject) {
        this.f37105b = srVar;
        this.f37104a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.f37105b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f37104a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            sr.W(this.f37105b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
