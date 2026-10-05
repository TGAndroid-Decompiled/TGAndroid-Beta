package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements kr {
    public final rr f36739a;

    public gr(rr rrVar) {
        this.f36739a = rrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f36739a, user);
    }

    @Override
    public final void b(long j3) {
        rr rrVar = this.f36739a;
        ArrayList arrayList = rrVar.F;
        a0.i iVar = rrVar.K;
        TLRPC.User user = rrVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new oh(22, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            lr w02 = rrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f20194id;
            tL_channelParticipantAdmin.date = rrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = rrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.f20194id);
            Collections.sort(arrayList, new ff(4));
            rrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        rr rrVar = this.f36739a;
        ArrayList arrayList = rrVar.F;
        a0.i iVar = rrVar.K;
        if (tLObject != null && iVar.f(j3) == null) {
            lr w02 = rrVar.w0();
            arrayList.add(tLObject);
            iVar.k(tLObject, j3);
            Collections.sort(arrayList, new ff(4));
            rrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
