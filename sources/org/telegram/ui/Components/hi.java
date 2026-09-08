package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class hi implements pj {
    public final vi f26762a;

    public hi(vi viVar) {
        this.f26762a = viVar;
    }

    @Override
    public final void b(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.co coVar = (org.telegram.ui.co) this.f26762a.f31306f0;
        if (coVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, coVar.T5, coVar.f35379n5, coVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = coVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = coVar.N8();
            of2.suggestionParams = coVar.f35294g5;
            coVar.getSendMessagesHelper().sendMessage(of2);
            coVar.y6();
        }
    }

    @Override
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.co) this.f26762a.f31306f0).db(arrayList, str, z10, i10, j3, z11);
    }
}
