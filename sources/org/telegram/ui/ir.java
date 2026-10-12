package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ir implements qq {
    public final TLObject f37194a;
    public final long f37195b;
    public final boolean f37196c;
    public final yr d;

    public ir(yr yrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = yrVar;
        this.f37194a = tLObject;
        this.f37195b = j10;
        this.f37196c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        yr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f37194a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        yr yrVar = this.d;
        rr rrVar = yrVar.f42239m1;
        long j10 = this.f37195b;
        if (rrVar != null && i10 == 1) {
            rrVar.b(j10);
        } else if (rrVar != null) {
            rrVar.c(j10, tLObject);
        }
        if (this.f37196c) {
            yrVar.removeSelfFromStack();
        }
    }
}
