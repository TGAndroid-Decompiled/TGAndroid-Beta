package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gr implements kr {
    public final rr f34497a;

    public gr(rr rrVar) {
        this.f34497a = rrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        rr.c0(this.f34497a, user);
    }

    @Override
    public final void b(long j10) {
        rr rrVar = this.f34497a;
        ArrayList arrayList = rrVar.C;
        a0.h hVar = rrVar.H;
        TLRPC.User user = rrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new np(5, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            lr w02 = rrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f19306id;
            tL_channelParticipantAdmin.date = rrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = rrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.f19306id);
            Collections.sort(arrayList, new nh.e4(15));
            rrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        rr rrVar = this.f34497a;
        ArrayList arrayList = rrVar.C;
        a0.h hVar = rrVar.H;
        if (tLObject != null && hVar.f(j10) == null) {
            lr w02 = rrVar.w0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j10);
            Collections.sort(arrayList, new nh.e4(15));
            rrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
    }
}
