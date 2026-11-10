package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gq implements kq {
    public final rq f46144a;

    public gq(rq rqVar) {
        this.f46144a = rqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        rq.h0(this.f46144a, user);
    }

    @Override
    public final void b(long j3) {
        rq rqVar = this.f46144a;
        ArrayList arrayList = rqVar.E;
        a0.h hVar = rqVar.J;
        TLRPC.User a22 = rqVar.getMessagesController().a2(Long.valueOf(j3));
        if (a22 != null) {
            org.telegram.messenger.g0.i3(new fq(0, this, a22), 200L);
        }
        if (hVar.f(j3) == null) {
            lq B0 = rqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = a22.f27109id;
            tL_channelParticipantAdmin.date = rqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.p10.i(rqVar.getAccountInstance().f21770a).f24493n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, a22.f27109id);
            Collections.sort(arrayList, new pe(4));
            rqVar.F0(B0);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        rq rqVar = this.f46144a;
        ArrayList arrayList = rqVar.E;
        a0.h hVar = rqVar.J;
        if (tLObject != null && hVar.f(j3) == null) {
            lq B0 = rqVar.B0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j3);
            Collections.sort(arrayList, new pe(4));
            rqVar.F0(B0);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
