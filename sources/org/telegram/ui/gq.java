package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gq implements kq {
    public final rq f48155a;

    public gq(rq rqVar) {
        this.f48155a = rqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.f48155a, user);
    }

    @Override
    public final void b(long j3) {
        rq rqVar = this.f48155a;
        ArrayList arrayList = rqVar.F;
        a0.h hVar = rqVar.K;
        TLRPC.User c22 = rqVar.getMessagesController().c2(Long.valueOf(j3));
        if (c22 != null) {
            org.telegram.messenger.g0.h3(new eh(16, this, c22), 200L);
        }
        if (hVar.f(j3) == null) {
            lq B0 = rqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = c22.f28580id;
            tL_channelParticipantAdmin.date = rqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.j10.i(rqVar.getAccountInstance().f23246a).f24817n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, c22.f28580id);
            Collections.sort(arrayList, new pe(3));
            rqVar.F0(B0);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        rq rqVar = this.f48155a;
        ArrayList arrayList = rqVar.F;
        a0.h hVar = rqVar.K;
        if (tLObject != null && hVar.f(j3) == null) {
            lq B0 = rqVar.B0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j3);
            Collections.sort(arrayList, new pe(3));
            rqVar.F0(B0);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
