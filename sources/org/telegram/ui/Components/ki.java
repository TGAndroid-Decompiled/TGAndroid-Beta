package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class ki implements sj {
    public final yi f24736a;

    public ki(yi yiVar) {
        this.f24736a = yiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.f24736a.f29366f0;
        if (eoVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, eoVar.T5, eoVar.f32421n5, eoVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = eoVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = eoVar.N8();
            of2.suggestionParams = eoVar.f32336g5;
            eoVar.getSendMessagesHelper().sendMessage(of2);
            eoVar.y6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.eo) this.f24736a.f29366f0).db(arrayList, str, z10, i10, j3, z11);
    }
}
