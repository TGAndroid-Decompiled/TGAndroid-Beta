package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cr implements iq {
    public final TLObject f33210a;
    public final rr f33211b;

    public cr(rr rrVar, TLObject tLObject) {
        this.f33211b = rrVar;
        this.f33210a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f33211b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f33210a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            rr.W(this.f33211b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
