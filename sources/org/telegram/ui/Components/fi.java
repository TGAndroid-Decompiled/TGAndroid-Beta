package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class fi implements rj {
    public final wi f24288a;

    public fi(wi wiVar) {
        this.f24288a = wiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f24288a.f29962f0;
        if (xnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, xnVar.T5, xnVar.f39856n5, xnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = xnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = xnVar.N8();
            of2.suggestionParams = xnVar.f39770g5;
            xnVar.getSendMessagesHelper().sendMessage(of2);
            xnVar.y6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.xn) this.f24288a.f29962f0).db(arrayList, str, z10, i10, j3, z11);
    }
}
