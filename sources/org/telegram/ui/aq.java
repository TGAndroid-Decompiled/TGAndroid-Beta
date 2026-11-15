package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aq implements jp {
    public final TLObject f45481a;
    public final long f45482b;
    public final boolean f45483c;
    public final qq d;

    public aq(qq qqVar, TLObject tLObject, long j3, boolean z10) {
        this.d = qqVar;
        this.f45481a = tLObject;
        this.f45482b = j3;
        this.f45483c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        qq.h0(this.d, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f45481a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        qq qqVar = this.d;
        jq jqVar = qqVar.f50737m1;
        long j3 = this.f45482b;
        if (jqVar != null && i7 == 1) {
            jqVar.b(j3);
        } else if (jqVar != null) {
            jqVar.c(j3, tLObject);
        }
        if (this.f45483c) {
            qqVar.removeSelfFromStack();
        }
    }
}
