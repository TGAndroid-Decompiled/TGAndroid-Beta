package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bq implements kp {
    public final TLObject f46275a;
    public final long f46276b;
    public final boolean f46277c;
    public final rq d;

    public bq(rq rqVar, TLObject tLObject, long j3, boolean z10) {
        this.d = rqVar;
        this.f46275a = tLObject;
        this.f46276b = j3;
        this.f46277c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.d, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f46275a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        rq rqVar = this.d;
        kq kqVar = rqVar.f51755m1;
        long j3 = this.f46276b;
        if (kqVar != null && i7 == 1) {
            kqVar.b(j3);
        } else if (kqVar != null) {
            kqVar.c(j3, tLObject);
        }
        if (this.f46277c) {
            rqVar.removeSelfFromStack();
        }
    }
}
