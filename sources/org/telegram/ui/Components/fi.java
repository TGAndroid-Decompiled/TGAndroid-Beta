package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class fi implements oj {
    public final ti f26240a;

    public fi(ti tiVar) {
        this.f26240a = tiVar;
    }

    @Override
    public final void b(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.f26240a.f30574f0;
        if (snVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, snVar.T5, snVar.f41297n5, snVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = snVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = snVar.S8();
            of2.suggestionParams = snVar.f41211g5;
            snVar.getSendMessagesHelper().sendMessage(of2);
            snVar.B6();
        }
    }

    @Override
    public final void c(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.sn) this.f26240a.f30574f0).hb(arrayList, str, z10, i10, j10, z11);
    }
}
