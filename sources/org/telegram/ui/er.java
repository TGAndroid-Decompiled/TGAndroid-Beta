package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class er implements ir {
    public final pr f37101a;

    public er(pr prVar) {
        this.f37101a = prVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.g0(this.f37101a, user);
    }

    @Override
    public final void b(long j10) {
        pr prVar = this.f37101a;
        ArrayList arrayList = prVar.E;
        a0.h hVar = prVar.J;
        TLRPC.User Z1 = prVar.getMessagesController().Z1(Long.valueOf(j10));
        if (Z1 != null) {
            org.telegram.messenger.i0.h3(new zg(23, this, Z1), 200L);
        }
        if (hVar.f(j10) == null) {
            jr A0 = prVar.A0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = Z1.f19942id;
            tL_channelParticipantAdmin.date = prVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.d20.i(prVar.getAccountInstance().f14863a).f15165n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, Z1.f19942id);
            Collections.sort(arrayList, new f6(6));
            prVar.E0(A0);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        pr prVar = this.f37101a;
        ArrayList arrayList = prVar.E;
        a0.h hVar = prVar.J;
        if (tLObject != null && hVar.f(j10) == null) {
            jr A0 = prVar.A0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j10);
            Collections.sort(arrayList, new f6(6));
            prVar.E0(A0);
        }
    }

    @Override
    public final void d(long j10) {
    }
}
