package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements hq {
    public final TLObject f32453a;
    public final pr f32454b;

    public br(pr prVar, TLObject tLObject) {
        this.f32454b = prVar;
        this.f32453a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.f32454b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32453a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.W(this.f32454b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
