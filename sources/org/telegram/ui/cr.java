package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cr implements kq {
    public final TLObject f36724a;
    public final long f36725b;
    public final boolean f36726c;
    public final tr d;

    public cr(tr trVar, TLObject tLObject, long j3, boolean z10) {
        this.d = trVar;
        this.f36724a = tLObject;
        this.f36725b = j3;
        this.f36726c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        tr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f36724a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        tr trVar = this.d;
        lr lrVar = trVar.f42078m1;
        long j3 = this.f36725b;
        if (lrVar != null && i10 == 1) {
            lrVar.b(j3);
        } else if (lrVar != null) {
            lrVar.c(j3, tLObject);
        }
        if (this.f36726c) {
            trVar.removeSelfFromStack();
        }
    }
}
