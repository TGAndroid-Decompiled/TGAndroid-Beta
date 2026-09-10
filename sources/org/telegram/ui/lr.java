package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lr implements pr {
    public final wr f34760a;

    public lr(wr wrVar) {
        this.f34760a = wrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        wr.c0(this.f34760a, user);
    }

    @Override
    public final void b(long j3) {
        wr wrVar = this.f34760a;
        ArrayList arrayList = wrVar.F;
        a0.i iVar = wrVar.K;
        TLRPC.User user = wrVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new qh(21, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            qr w02 = wrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f17342id;
            tL_channelParticipantAdmin.date = wrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = wrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.f17342id);
            Collections.sort(arrayList, new a4.e(27));
            wrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        wr wrVar = this.f34760a;
        ArrayList arrayList = wrVar.F;
        a0.i iVar = wrVar.K;
        if (tLObject != null && iVar.f(j3) == null) {
            qr w02 = wrVar.w0();
            arrayList.add(tLObject);
            iVar.k(tLObject, j3);
            Collections.sort(arrayList, new a4.e(27));
            wrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
