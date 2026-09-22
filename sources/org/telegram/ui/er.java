package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class er implements mq {
    public final TLObject f33391a;
    public final long f33392b;
    public final boolean f33393c;
    public final ur d;

    public er(ur urVar, TLObject tLObject, long j3, boolean z10) {
        this.d = urVar;
        this.f33391a = tLObject;
        this.f33392b = j3;
        this.f33393c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        ur.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f33391a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        ur urVar = this.d;
        nr nrVar = urVar.f38134m1;
        long j3 = this.f33392b;
        if (nrVar != null && i10 == 1) {
            nrVar.b(j3);
        } else if (nrVar != null) {
            nrVar.c(j3, tLObject);
        }
        if (this.f33393c) {
            urVar.removeSelfFromStack();
        }
    }
}
