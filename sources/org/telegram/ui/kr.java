package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kr implements or {
    public final wr f39573a;

    public kr(wr wrVar) {
        this.f39573a = wrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        wr.c0(this.f39573a, user);
    }

    @Override
    public final void b(long j3) {
        wr wrVar = this.f39573a;
        ArrayList arrayList = wrVar.F;
        a0.i iVar = wrVar.K;
        TLRPC.User user = wrVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new nh(23, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            pr w02 = wrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f19949id;
            tL_channelParticipantAdmin.date = wrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = wrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.f19949id);
            Collections.sort(arrayList, new lf(4));
            wrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        wr wrVar = this.f39573a;
        ArrayList arrayList = wrVar.F;
        a0.i iVar = wrVar.K;
        if (tLObject != null && iVar.f(j3) == null) {
            pr w02 = wrVar.w0();
            arrayList.add(tLObject);
            iVar.k(tLObject, j3);
            Collections.sort(arrayList, new lf(4));
            wrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
