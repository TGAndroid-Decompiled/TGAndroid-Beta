package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dr implements kq {
    public final TLObject f33139a;
    public final sr f33140b;

    public dr(sr srVar, TLObject tLObject) {
        this.f33140b = srVar;
        this.f33139a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.f33140b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f33139a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            sr.W(this.f33140b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
