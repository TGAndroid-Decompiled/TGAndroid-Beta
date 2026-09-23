package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class ii implements qj {
    public final wi f24981a;

    public ii(wi wiVar) {
        this.f24981a = wiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f24981a.f29665f0;
        if (xnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, xnVar.T5, xnVar.f39475n5, xnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = xnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = xnVar.N8();
            of2.suggestionParams = xnVar.f39390g5;
            xnVar.getSendMessagesHelper().sendMessage(of2);
            xnVar.y6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.xn) this.f24981a.f29665f0).db(arrayList, str, z10, i10, j3, z11);
    }
}
