package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class wh implements ij {
    public final mi f32754a;

    public wh(mi miVar) {
        this.f32754a = miVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z4, int i10, long j10) {
        org.telegram.ui.xn xnVar = (org.telegram.ui.xn) this.f32754a.f29058c0;
        if (xnVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, xnVar.Q5, xnVar.f43223k5, xnVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
            of2.sendMessageChatArguments = xnVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = xnVar.N8();
            of2.suggestionParams = xnVar.f43135d5;
            xnVar.getSendMessagesHelper().sendMessage(of2);
            xnVar.y6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
        ((org.telegram.ui.xn) this.f32754a.f29058c0).db(arrayList, str, z4, i10, j10, z10);
    }
}
