package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar implements hq {
    public final TLObject f32215a;
    public final pr f32216b;

    public ar(pr prVar, TLObject tLObject) {
        this.f32216b = prVar;
        this.f32215a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.f32216b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32215a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.W(this.f32216b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
