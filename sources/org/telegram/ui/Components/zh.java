package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class zh implements ij {
    public final ni f35349a;

    public zh(ni niVar) {
        this.f35349a = niVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.tn tnVar = (org.telegram.ui.tn) this.f35349a.f30990b0;
        if (tnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, tnVar.P5, tnVar.f42856j5, tnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = tnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = tnVar.N8();
            of2.suggestionParams = tnVar.f42768c5;
            tnVar.getSendMessagesHelper().sendMessage(of2);
            tnVar.y6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.tn) this.f35349a.f30990b0).db(arrayList, str, z10, i10, j10, z11);
    }
}
