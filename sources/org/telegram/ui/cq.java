package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cq implements jp {
    public final TLObject f46202a;
    public final qq f46203b;

    public cq(qq qqVar, TLObject tLObject) {
        this.f46203b = qqVar;
        this.f46202a = tLObject;
    }

    @Override
    public final void a(TLRPC.User user) {
        qq.h0(this.f46203b, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f46202a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
            qq.b0(this.f46203b, channelParticipant, tL_chatAdminRights, tL_chatBannedRights);
        }
    }
}
