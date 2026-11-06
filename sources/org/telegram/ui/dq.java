package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dq implements hq {
    public final oq f45127a;

    public dq(oq oqVar) {
        this.f45127a = oqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        oq.h0(this.f45127a, user);
    }

    @Override
    public final void b(long j3) {
        oq oqVar = this.f45127a;
        ArrayList arrayList = oqVar.E;
        a0.h hVar = oqVar.J;
        TLRPC.User a22 = oqVar.getMessagesController().a2(Long.valueOf(j3));
        if (a22 != null) {
            org.telegram.messenger.g0.i3(new qf(29, this, a22), 200L);
        }
        if (hVar.f(j3) == null) {
            iq B0 = oqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = a22.f27102id;
            tL_channelParticipantAdmin.date = oqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.p10.i(oqVar.getAccountInstance().f21729a).f24486n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, a22.f27102id);
            Collections.sort(arrayList, new oe(4));
            oqVar.F0(B0);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        oq oqVar = this.f45127a;
        ArrayList arrayList = oqVar.E;
        a0.h hVar = oqVar.J;
        if (tLObject != null && hVar.f(j3) == null) {
            iq B0 = oqVar.B0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j3);
            Collections.sort(arrayList, new oe(4));
            oqVar.F0(B0);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
