package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ir implements qq {
    public final TLObject f36858a;
    public final long f36859b;
    public final boolean f36860c;
    public final yr d;

    public ir(yr yrVar, TLObject tLObject, long j10, boolean z10) {
        this.d = yrVar;
        this.f36858a = tLObject;
        this.f36859b = j10;
        this.f36860c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        yr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f36858a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        yr yrVar = this.d;
        rr rrVar = yrVar.f41916m1;
        long j10 = this.f36859b;
        if (rrVar != null && i10 == 1) {
            rrVar.b(j10);
        } else if (rrVar != null) {
            rrVar.c(j10, tLObject);
        }
        if (this.f36860c) {
            yrVar.removeSelfFromStack();
        }
    }
}
