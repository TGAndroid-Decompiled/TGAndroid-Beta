package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr implements mq {
    public final TLObject f33646a;
    public final ur f33647b;

    public fr(ur urVar, TLObject tLObject) {
        this.f33647b = urVar;
        this.f33646a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        ur.c0(this.f33647b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f33646a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            ur.W(this.f33647b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
