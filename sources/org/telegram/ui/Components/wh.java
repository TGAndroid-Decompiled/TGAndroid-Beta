package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class wh implements fj {
    public final ki f34227a;

    public wh(ki kiVar) {
        this.f34227a = kiVar;
    }

    @Override
    public final void b(TLRPC.User user, boolean z10, int i9, long j10) {
        org.telegram.ui.qn qnVar = (org.telegram.ui.qn) this.f34227a.f30099b0;
        if (qnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, qnVar.P5, qnVar.f41959j5, qnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i9, 0);
            of2.sendMessageChatArguments = qnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = qnVar.N8();
            of2.suggestionParams = qnVar.f41870c5;
            qnVar.getSendMessagesHelper().sendMessage(of2);
            qnVar.y6();
        }
    }

    @Override
    public final void c(ArrayList arrayList, String str, boolean z10, int i9, long j10, boolean z11) {
        ((org.telegram.ui.qn) this.f34227a.f30099b0).db(arrayList, str, z10, i9, j10, z11);
    }
}
