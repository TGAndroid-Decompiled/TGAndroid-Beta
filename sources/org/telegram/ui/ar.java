package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar implements mq {
    public final TLObject f31891a;
    public final ur f31892b;

    public ar(ur urVar, TLObject tLObject) {
        this.f31892b = urVar;
        this.f31891a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        ur.c0(this.f31892b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f31891a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            ur.W(this.f31892b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
