package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aq implements jp {
    public final TLObject f43790a;
    public final long f43791b;
    public final boolean f43792c;
    public final rq d;

    public aq(rq rqVar, TLObject tLObject, long j3, boolean z9) {
        this.d = rqVar;
        this.f43790a = tLObject;
        this.f43791b = j3;
        this.f43792c = z9;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.d, user);
    }

    @Override
    public final void b(int i7, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f43790a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        rq rqVar = this.d;
        kq kqVar = rqVar.l1;
        long j3 = this.f43791b;
        if (kqVar != null && i7 == 1) {
            kqVar.b(j3);
        } else if (kqVar != null) {
            kqVar.c(j3, tLObject);
        }
        if (this.f43792c) {
            rqVar.removeSelfFromStack();
        }
    }
}
