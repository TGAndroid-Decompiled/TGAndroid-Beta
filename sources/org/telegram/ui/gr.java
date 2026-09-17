package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements mq {
    public final TLObject f34029a;
    public final ur f34030b;

    public gr(ur urVar, TLObject tLObject) {
        this.f34030b = urVar;
        this.f34029a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        ur.c0(this.f34030b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f34029a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            ur.W(this.f34030b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
