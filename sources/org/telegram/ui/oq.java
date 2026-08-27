package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class oq implements aq {

    public final TLObject f41153a;

    public final lr f41154b;

    public oq(lr lrVar, TLObject tLObject) {
        this.f41154b = lrVar;
        this.f41153a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        lr.c0(this.f41154b, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f41153a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            lr.W(this.f41154b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
