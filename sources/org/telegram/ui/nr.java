package org.telegram.ui;

import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nr implements rr {
    public final yr f38784a;

    public nr(yr yrVar) {
        this.f38784a = yrVar;
    }

    @Override
    public final void a(TLRPC.User user) {
        yr.c0(this.f38784a, user);
    }

    @Override
    public final void b(long j10) {
        yr yrVar = this.f38784a;
        ArrayList arrayList = yrVar.F;
        a0.h hVar = yrVar.K;
        TLRPC.User user = yrVar.getMessagesController().getUser(Long.valueOf(j10));
        if (user != null) {
            AndroidUtilities.runOnUIThread(new rp(7, this, user), 200L);
        }
        if (hVar.f(j10) == null) {
            sr w02 = yrVar.w0();
            TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_channelParticipantAdmin.peer = tL_peerUser;
            tL_peerUser.user_id = user.f19363id;
            tL_channelParticipantAdmin.date = yrVar.getConnectionsManager().getCurrentTime();
            tL_channelParticipantAdmin.promoted_by = yrVar.getAccountInstance().getUserConfig().clientUserId;
            arrayList.add(tL_channelParticipantAdmin);
            hVar.k(tL_channelParticipantAdmin, user.f19363id);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(8));
            yrVar.A0(w02);
        }
    }

    @Override
    public final void c(long j10, TLObject tLObject) {
        yr yrVar = this.f38784a;
        ArrayList arrayList = yrVar.F;
        a0.h hVar = yrVar.K;
        if (tLObject != null && hVar.f(j10) == null) {
            sr w02 = yrVar.w0();
            arrayList.add(tLObject);
            hVar.k(tLObject, j10);
            Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(8));
            yrVar.A0(w02);
        }
    }

    @Override
    public final void d(long j10) {
    }
}
