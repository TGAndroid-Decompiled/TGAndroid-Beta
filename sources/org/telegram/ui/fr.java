package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr implements jr {
    public final qr f36900a;

    public fr(qr qrVar) {
        this.f36900a = qrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f36900a, user);
    }

    @Override
    public final void b(long j10) {
        qr qrVar = this.f36900a;
        ArrayList arrayList = qrVar.C;
        a0.h hVar = qrVar.H;
        TLRPC.User user = qrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new mp(4, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            kr w02 = qrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f20992id;
            tL_channelParticipantAdmin.date = qrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = qrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.f20992id);
            Collections.sort(arrayList, new oh.k0(15));
            qrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        qr qrVar = this.f36900a;
        ArrayList arrayList = qrVar.C;
        a0.h hVar = qrVar.H;
        if (tLObject != null && hVar.f(j10) == null) {
            kr w02 = qrVar.w0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j10);
            Collections.sort(arrayList, new oh.k0(15));
            qrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
    }
}
