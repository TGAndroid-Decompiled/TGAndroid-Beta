package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class hi implements qj {
    public final vi f25321a;

    public hi(vi viVar) {
        this.f25321a = viVar;
    }

    @Override
    public final void b(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.fo foVar = (org.telegram.ui.fo) this.f25321a.f29672f0;
        if (foVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, foVar.T5, foVar.f35739n5, foVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = foVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = foVar.S8();
            of2.suggestionParams = foVar.f35653g5;
            foVar.getSendMessagesHelper().sendMessage(of2);
            foVar.B6();
        }
    }

    @Override
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.fo) this.f25321a.f29672f0).hb(arrayList, str, z10, i10, j10, z11);
    }
}
