package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements oq {
    public final TLObject f33162a;
    public final long f33163b;
    public final boolean f33164c;
    public final wr d;

    public gr(wr wrVar, TLObject tLObject, long j3, boolean z10) {
        this.d = wrVar;
        this.f33162a = tLObject;
        this.f33163b = j3;
        this.f33164c = z10;
    }

    @Override
    public final void a(TLRPC.User user) {
        wr.c0(this.d, user);
    }

    @Override
    public final void b(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str) {
        TLObject tLObject = this.f33162a;
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            channelParticipant.admin_rights = tL_chatAdminRights;
            channelParticipant.banned_rights = tL_chatBannedRights;
            channelParticipant.rank = str;
        }
        wr wrVar = this.d;
        pr prVar = wrVar.f38344m1;
        long j3 = this.f33163b;
        if (prVar != null && i10 == 1) {
            prVar.b(j3);
        } else if (prVar != null) {
            prVar.c(j3, tLObject);
        }
        if (this.f33164c) {
            wrVar.removeSelfFromStack();
        }
    }
}
