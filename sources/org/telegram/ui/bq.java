package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bq implements kp {
    public final TLObject f46266a;
    public final long f46267b;
    public final boolean f46268c;
    public final rq d;

    public bq(rq rqVar, TLObject tLObject, long j3, boolean z10) {
        this.d = rqVar;
        this.f46266a = tLObject;
        this.f46267b = j3;
        this.f46268c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.d, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f46266a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        rq rqVar = this.d;
        kq kqVar = rqVar.f51744m1;
        long j3 = this.f46267b;
        if (kqVar != null && i7 == 1) {
            kqVar.b(j3);
        } else if (kqVar != null) {
            kqVar.c(j3, tLObject);
        }
        if (this.f46268c) {
            rqVar.removeSelfFromStack();
        }
    }
}
