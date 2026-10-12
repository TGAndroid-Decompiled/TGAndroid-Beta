package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class mi implements vj {
    public final aj f28553a;

    public mi(aj ajVar) {
        this.f28553a = ajVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.eo eoVar = (org.telegram.ui.eo) this.f28553a.f24338f0;
        if (eoVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, eoVar.T5, eoVar.f37361n5, eoVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = eoVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = eoVar.S8();
            of2.suggestionParams = eoVar.f37276g5;
            eoVar.getSendMessagesHelper().sendMessage(of2);
            eoVar.B6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.eo) this.f28553a.f24338f0).hb(arrayList, str, z10, i10, j3, z11);
    }
}
