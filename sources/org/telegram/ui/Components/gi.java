package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class gi implements sj {
    public final xi f26874a;

    public gi(xi xiVar) {
        this.f26874a = xiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.yn ynVar = (org.telegram.ui.yn) this.f26874a.f32819f0;
        if (ynVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, ynVar.R5, ynVar.f43412l5, ynVar.V3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = ynVar.D8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = ynVar.O8();
            of2.suggestionParams = ynVar.f43328e5;
            ynVar.getSendMessagesHelper().sendMessage(of2);
            ynVar.y6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.yn) this.f26874a.f32819f0).cb(arrayList, str, z10, i10, j3, z11);
    }
}
