package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bq implements fq {
    public final nq f44124a;

    public bq(nq nqVar) {
        this.f44124a = nqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        nq.h0(this.f44124a, user);
    }

    @Override
    public final void b(long j10) {
        nq nqVar = this.f44124a;
        ArrayList arrayList = nqVar.F;
        a0.h hVar = nqVar.K;
        TLRPC.User a22 = nqVar.getMessagesController().a2(Long.valueOf(j10));
        if (a22 != null) {
            org.telegram.messenger.g0.i3(new lo(4, this, a22), 200L);
        }
        if (hVar.f(j10) == null) {
            gq B0 = nqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = a22.f27150id;
            tL_channelParticipantAdmin.date = nqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.h10.i(nqVar.getAccountInstance().f21919a).f22848n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, a22.f27150id);
            Collections.sort(arrayList, new org.telegram.messenger.tq(24));
            nqVar.F0(B0);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        nq nqVar = this.f44124a;
        ArrayList arrayList = nqVar.F;
        a0.h hVar = nqVar.K;
        if (tLObject != null && hVar.f(j10) == null) {
            gq B0 = nqVar.B0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j10);
            Collections.sort(arrayList, new org.telegram.messenger.tq(24));
            nqVar.F0(B0);
        }
    }

    @Override
    public final void d(long j10) {
    }
}
