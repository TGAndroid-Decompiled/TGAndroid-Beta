package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kr implements qq {
    public final TLObject f37488a;
    public final yr f37489b;

    public kr(yr yrVar, TLObject tLObject) {
        this.f37489b = yrVar;
        this.f37488a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        yr.c0(this.f37489b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f37488a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            yr.W(this.f37489b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
