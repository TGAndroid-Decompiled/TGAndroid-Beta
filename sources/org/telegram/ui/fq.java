package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fq implements jq {
    public final qq f45777a;

    public fq(qq qqVar) {
        this.f45777a = qqVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        qq.h0(this.f45777a, user);
    }

    @Override
    public final void b(long j3) {
        qq qqVar = this.f45777a;
        ArrayList arrayList = qqVar.E;
        a0.h hVar = qqVar.J;
        TLRPC.User a22 = qqVar.getMessagesController().a2(Long.valueOf(j3));
        if (a22 != null) {
            org.telegram.messenger.g0.i3(new rf(29, this, a22), 200L);
        }
        if (hVar.f(j3) == null) {
            kq B0 = qqVar.B0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = a22.f27105id;
            tL_channelParticipantAdmin.date = qqVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = org.telegram.messenger.p10.i(qqVar.getAccountInstance().f21765a).f24489n;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, a22.f27105id);
            Collections.sort(arrayList, new oe(4));
            qqVar.F0(B0);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        qq qqVar = this.f45777a;
        ArrayList arrayList = qqVar.E;
        a0.h hVar = qqVar.J;
        if (tLObject != null && hVar.f(j3) == null) {
            kq B0 = qqVar.B0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j3);
            Collections.sort(arrayList, new oe(4));
            qqVar.F0(B0);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
