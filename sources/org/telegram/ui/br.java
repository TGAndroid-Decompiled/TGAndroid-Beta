package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements jq {
    public final TLObject f35201a;
    public final long f35202b;
    public final boolean f35203c;
    public final rr d;

    public br(rr rrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = rrVar;
        this.f35201a = tLObject;
        this.f35202b = j3;
        this.f35203c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35201a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        rr rrVar = this.d;
        kr krVar = rrVar.f40192m1;
        long j3 = this.f35202b;
        if (krVar != null && i10 == 1) {
            krVar.b(j3);
        } else if (krVar != null) {
            krVar.c(j3, tLObject);
        }
        if (this.f35203c) {
            rrVar.removeSelfFromStack();
        }
    }
}
