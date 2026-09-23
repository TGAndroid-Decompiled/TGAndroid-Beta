package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fr implements jr {
    public final qr f33355a;

    public fr(qr qrVar) {
        this.f33355a = qrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        qr.c0(this.f33355a, user);
    }

    @Override
    public final void b(long j3) {
        qr qrVar = this.f33355a;
        ArrayList arrayList = qrVar.F;
        a0.i iVar = qrVar.K;
        TLRPC.User user = qrVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new rh(18, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            kr w02 = qrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f18230id;
            tL_channelParticipantAdmin.date = qrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = qrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.f18230id);
            Collections.sort(arrayList, new df(4));
            qrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        qr qrVar = this.f33355a;
        ArrayList arrayList = qrVar.F;
        a0.i iVar = qrVar.K;
        if (tLObject != null && iVar.f(j3) == null) {
            kr w02 = qrVar.w0();
            arrayList.add(tLObject);
            iVar.k(tLObject, j3);
            Collections.sort(arrayList, new df(4));
            qrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
