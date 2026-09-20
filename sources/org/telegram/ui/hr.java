package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hr implements lr {
    public final sr f34261a;

    public hr(sr srVar) {
        this.f34261a = srVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        sr.c0(this.f34261a, user);
    }

    @Override
    public final void b(long j3) {
        sr srVar = this.f34261a;
        ArrayList arrayList = srVar.F;
        a0.i iVar = srVar.K;
        TLRPC.User user = srVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new gh(24, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            mr w02 = srVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f18475id;
            tL_channelParticipantAdmin.date = srVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = srVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.f18475id);
            Collections.sort(arrayList, new df(4));
            srVar.A0(w02);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        sr srVar = this.f34261a;
        ArrayList arrayList = srVar.F;
        a0.i iVar = srVar.K;
        if (tLObject != null && iVar.f(j3) == null) {
            mr w02 = srVar.w0();
            arrayList.add(tLObject);
            iVar.k(tLObject, j3);
            Collections.sort(arrayList, new df(4));
            srVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
