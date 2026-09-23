package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar implements iq {
    public final TLObject f31863a;
    public final long f31864b;
    public final boolean f31865c;
    public final qr d;

    public ar(qr qrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = qrVar;
        this.f31863a = tLObject;
        this.f31864b = j3;
        this.f31865c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f31863a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        qr qrVar = this.d;
        jr jrVar = qrVar.f36572m1;
        long j3 = this.f31864b;
        if (jrVar != null && i10 == 1) {
            jrVar.b(j3);
        } else if (jrVar != null) {
            jrVar.c(j3, tLObject);
        }
        if (this.f31865c) {
            qrVar.removeSelfFromStack();
        }
    }
}
