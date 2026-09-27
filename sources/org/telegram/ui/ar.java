package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar implements iq {
    public final TLObject f32126a;
    public final long f32127b;
    public final boolean f32128c;
    public final qr d;

    public ar(qr qrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = qrVar;
        this.f32126a = tLObject;
        this.f32127b = j3;
        this.f32128c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32126a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        qr qrVar = this.d;
        jr jrVar = qrVar.f36844m1;
        long j3 = this.f32127b;
        if (jrVar != null && i10 == 1) {
            jrVar.b(j3);
        } else if (jrVar != null) {
            jrVar.c(j3, tLObject);
        }
        if (this.f32128c) {
            qrVar.removeSelfFromStack();
        }
    }
}
