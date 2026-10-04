package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements jq {
    public final TLObject f35177a;
    public final long f35178b;
    public final boolean f35179c;
    public final rr d;

    public br(rr rrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = rrVar;
        this.f35177a = tLObject;
        this.f35178b = j3;
        this.f35179c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f35177a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        rr rrVar = this.d;
        kr krVar = rrVar.f40217m1;
        long j3 = this.f35178b;
        if (krVar != null && i10 == 1) {
            krVar.b(j3);
        } else if (krVar != null) {
            krVar.c(j3, tLObject);
        }
        if (this.f35179c) {
            rrVar.removeSelfFromStack();
        }
    }
}
