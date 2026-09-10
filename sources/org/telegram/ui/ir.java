package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ir implements oq {
    public final TLObject f33783a;
    public final wr f33784b;

    public ir(wr wrVar, TLObject tLObject) {
        this.f33784b = wrVar;
        this.f33783a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        wr.c0(this.f33784b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f33783a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            wr.W(this.f33784b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
