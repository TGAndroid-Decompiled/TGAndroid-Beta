package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements hq {
    public final TLObject f32467a;
    public final pr f32468b;

    public br(pr prVar, TLObject tLObject) {
        this.f32468b = prVar;
        this.f32467a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.f32468b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32467a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            pr.W(this.f32468b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
