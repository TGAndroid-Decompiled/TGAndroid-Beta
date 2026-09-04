package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr implements nq {
    public final TLObject f36450a;
    public final long f36451b;
    public final boolean f36452c;
    public final vr d;

    public fr(vr vrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = vrVar;
        this.f36450a = tLObject;
        this.f36451b = j3;
        this.f36452c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        vr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f36450a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        vr vrVar = this.d;
        or orVar = vrVar.f41657m1;
        long j3 = this.f36451b;
        if (orVar != null && i10 == 1) {
            orVar.b(j3);
        } else if (orVar != null) {
            orVar.c(j3, tLObject);
        }
        if (this.f36452c) {
            vrVar.removeSelfFromStack();
        }
    }
}
