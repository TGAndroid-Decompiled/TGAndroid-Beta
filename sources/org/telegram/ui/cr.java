package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cr implements oq {
    public final TLObject f31759a;
    public final wr f31760b;

    public cr(wr wrVar, TLObject tLObject) {
        this.f31760b = wrVar;
        this.f31759a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        wr.c0(this.f31760b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f31759a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            wr.W(this.f31760b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
