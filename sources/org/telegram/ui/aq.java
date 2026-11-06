package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aq implements hp {
    public final TLObject f44073a;
    public final oq f44074b;

    public aq(oq oqVar, TLObject tLObject) {
        this.f44074b = oqVar;
        this.f44073a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        oq.h0(this.f44074b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f44073a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            oq.b0(this.f44074b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
