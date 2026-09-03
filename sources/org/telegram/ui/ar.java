package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ar implements iq {
    public final TLObject f32627a;
    public final long f32628b;
    public final boolean f32629c;
    public final rr d;

    public ar(rr rrVar, TLObject tLObject, long j10, boolean z4) {
        this.d = rrVar;
        this.f32627a = tLObject;
        this.f32628b = j10;
        this.f32629c = z4;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32627a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        rr rrVar = this.d;
        kr krVar = rrVar.f37978j1;
        long j10 = this.f32628b;
        if (krVar != null && i10 == 1) {
            krVar.b(j10);
        } else if (krVar != null) {
            krVar.c(j10, tLObject);
        }
        if (this.f32629c) {
            rrVar.removeSelfFromStack();
        }
    }
}
