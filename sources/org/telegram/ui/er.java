package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class er implements qq {
    public final TLObject f35368a;
    public final yr f35369b;

    public er(yr yrVar, TLObject tLObject) {
        this.f35369b = yrVar;
        this.f35368a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        yr.c0(this.f35369b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35368a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            yr.W(this.f35369b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
