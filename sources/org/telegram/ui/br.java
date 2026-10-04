package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements jq {
    public final TLObject f35171a;
    public final long f35172b;
    public final boolean f35173c;
    public final rr d;

    public br(rr rrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = rrVar;
        this.f35171a = tLObject;
        this.f35172b = j3;
        this.f35173c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35171a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        rr rrVar = this.d;
        kr krVar = rrVar.f40211m1;
        long j3 = this.f35172b;
        if (krVar != null && i10 == 1) {
            krVar.b(j3);
        } else if (krVar != null) {
            krVar.c(j3, tLObject);
        }
        if (this.f35173c) {
            rrVar.removeSelfFromStack();
        }
    }
}
