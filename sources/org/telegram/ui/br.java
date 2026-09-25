package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements hq {
    public final TLObject f32468a;
    public final pr f32469b;

    public br(pr prVar, TLObject tLObject) {
        this.f32469b = prVar;
        this.f32468a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.f32469b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32468a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.W(this.f32469b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
