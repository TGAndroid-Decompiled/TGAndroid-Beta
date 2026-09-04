package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kr implements or {
    public final vr f38115a;

    public kr(vr vrVar) {
        this.f38115a = vrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        vr.c0(this.f38115a, user);
    }

    @Override
    public final void b(long j3) {
        vr vrVar = this.f38115a;
        ArrayList arrayList = vrVar.F;
        a0.i iVar = vrVar.K;
        TLRPC.User user = vrVar.getMessagesController().getUser(Long.valueOf(j3));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new fh(24, this, user), 200L);
        }
        if (iVar.f(j3) == null) {
            pr w02 = vrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f20016id;
            tL_channelParticipantAdmin.date = vrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = vrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            iVar.k(tL_channelParticipantAdmin, user.f20016id);
            Collections.sort(arrayList, new f6(6));
            vrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j3, TLObject tLObject) {
        vr vrVar = this.f38115a;
        ArrayList arrayList = vrVar.F;
        a0.i iVar = vrVar.K;
        if (tLObject != null && iVar.f(j3) == null) {
            pr w02 = vrVar.w0();
            arrayList.add(tLObject);
            iVar.k(tLObject, j3);
            Collections.sort(arrayList, new f6(6));
            vrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j3) {
    }
}
