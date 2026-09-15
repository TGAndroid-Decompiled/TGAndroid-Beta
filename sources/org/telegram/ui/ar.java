package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar implements mq {
    public final TLObject f31906a;
    public final ur f31907b;

    public ar(ur urVar, TLObject tLObject) {
        this.f31907b = urVar;
        this.f31906a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        ur.c0(this.f31907b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f31906a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            ur.W(this.f31907b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
