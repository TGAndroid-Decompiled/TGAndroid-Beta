package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class fi implements oj {
    public final ti f26226a;

    public fi(ti tiVar) {
        this.f26226a = tiVar;
    }

    @Override
    public final void b(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.f26226a.f30549f0;
        if (qnVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, qnVar.T5, qnVar.f40782n5, qnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = qnVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = qnVar.S8();
            of2.suggestionParams = qnVar.f40696g5;
            qnVar.getSendMessagesHelper().sendMessage(of2);
            qnVar.B6();
        }
    }

    @Override
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.qn) this.f26226a.f30549f0).ib(arrayList, str, z10, i10, j10, z11);
    }
}
