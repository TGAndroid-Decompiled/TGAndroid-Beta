package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cr implements kq {
    public final TLObject f36805a;
    public final long f36806b;
    public final boolean f36807c;
    public final sr d;

    public cr(sr srVar, TLObject tLObject, long j3, boolean z10) {
        this.d = srVar;
        this.f36805a = tLObject;
        this.f36806b = j3;
        this.f36807c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f36805a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        sr srVar = this.d;
        lr lrVar = srVar.f41812m1;
        long j3 = this.f36806b;
        if (lrVar != null && i10 == 1) {
            lrVar.b(j3);
        } else if (lrVar != null) {
            lrVar.c(j3, tLObject);
        }
        if (this.f36807c) {
            srVar.removeSelfFromStack();
        }
    }
}
