package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr implements nq {
    public final TLObject f37826a;
    public final long f37827b;
    public final boolean f37828c;
    public final wr d;

    public fr(wr wrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = wrVar;
        this.f37826a = tLObject;
        this.f37827b = j3;
        this.f37828c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        wr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f37826a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        wr wrVar = this.d;
        or orVar = wrVar.f43636m1;
        long j3 = this.f37827b;
        if (orVar != null && i10 == 1) {
            orVar.b(j3);
        } else if (orVar != null) {
            orVar.c(j3, tLObject);
        }
        if (this.f37828c) {
            wrVar.removeSelfFromStack();
        }
    }
}
