package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements mq {
    public final TLObject f33920a;
    public final ur f33921b;

    public gr(ur urVar, TLObject tLObject) {
        this.f33921b = urVar;
        this.f33920a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        ur.c0(this.f33921b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f33920a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            ur.W(this.f33921b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
