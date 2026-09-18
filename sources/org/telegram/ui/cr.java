package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cr implements kq {
    public final TLObject f32757a;
    public final long f32758b;
    public final boolean f32759c;
    public final sr d;

    public cr(sr srVar, TLObject tLObject, long j3, boolean z10) {
        this.d = srVar;
        this.f32757a = tLObject;
        this.f32758b = j3;
        this.f32759c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f32757a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        sr srVar = this.d;
        lr lrVar = srVar.f37419m1;
        long j3 = this.f32758b;
        if (lrVar != null && i10 == 1) {
            lrVar.b(j3);
        } else if (lrVar != null) {
            lrVar.c(j3, tLObject);
        }
        if (this.f32759c) {
            srVar.removeSelfFromStack();
        }
    }
}
