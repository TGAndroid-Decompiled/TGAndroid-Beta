package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class wh implements gj {
    public final li f30350a;

    public wh(li liVar) {
        this.f30350a = liVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z4, int i10, long j10) {
        org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f30350a.f26689c0;
        if (xnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, xnVar.Q5, xnVar.f40076k5, xnVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
            of2.sendMessageChatArguments = xnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = xnVar.N8();
            of2.suggestionParams = xnVar.f39989d5;
            xnVar.getSendMessagesHelper().sendMessage(of2);
            xnVar.y6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
        ((org.telegram.ui.xn) this.f30350a.f26689c0).db(arrayList, str, z4, i10, j10, z10);
    }
}
