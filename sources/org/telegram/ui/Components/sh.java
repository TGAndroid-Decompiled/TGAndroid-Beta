package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;

public final class sh implements bj {

    public final gi f32440a;

    public sh(gi giVar) {
        this.f32440a = giVar;
    }

    @Override
    public final void b(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.rn rnVar = (org.telegram.ui.rn) this.f32440a.f28635b0;
        if (rnVar.f7()) {
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(user, rnVar.P5, rnVar.f42095j5, rnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            sendMessageParamsOf.sendMessageChatArguments = rnVar.C8();
            sendMessageParamsOf.effect_id = 0L;
            sendMessageParamsOf.invert_media = false;
            sendMessageParamsOf.payStars = j10;
            sendMessageParamsOf.monoForumPeer = rnVar.N8();
            sendMessageParamsOf.suggestionParams = rnVar.f42006c5;
            rnVar.getSendMessagesHelper().sendMessage(sendMessageParamsOf);
            rnVar.y6();
        }
    }

    @Override
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.rn) this.f32440a.f28635b0).db(arrayList, str, z10, i10, j10, z11);
    }
}
