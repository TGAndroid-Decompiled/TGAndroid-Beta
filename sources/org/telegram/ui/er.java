package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class er implements ir {
    public final pr f34071a;

    public er(pr prVar) {
        this.f34071a = prVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        pr.c0(this.f34071a, user);
    }

    @Override
    public final void b(long j10) {
        pr prVar = this.f34071a;
        ArrayList arrayList = prVar.C;
        a0.h hVar = prVar.H;
        TLRPC.User user = prVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new hp(6, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            jr w02 = prVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f19331id;
            tL_channelParticipantAdmin.date = prVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = prVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.f19331id);
            Collections.sort(arrayList, new nh.e4(15));
            prVar.A0(w02);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        pr prVar = this.f34071a;
        ArrayList arrayList = prVar.C;
        a0.h hVar = prVar.H;
        if (tLObject != null && hVar.f(j10) == null) {
            jr w02 = prVar.w0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j10);
            Collections.sort(arrayList, new nh.e4(15));
            prVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
    }
}
