package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr implements mq {
    public final TLObject f33740a;
    public final ur f33741b;

    public fr(ur urVar, TLObject tLObject) {
        this.f33741b = urVar;
        this.f33740a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        ur.c0(this.f33741b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f33740a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            ur.W(this.f33741b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
