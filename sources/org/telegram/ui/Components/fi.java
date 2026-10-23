package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class fi implements oj {
    public final ti f26332a;

    public fi(ti tiVar) {
        this.f26332a = tiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.sn snVar = (org.telegram.ui.sn) this.f26332a.f30730f0;
        if (snVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, snVar.f41519f6, snVar.f41767z5, snVar.f41564j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = snVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = snVar.S8();
            of2.suggestionParams = snVar.f41677s5;
            snVar.getSendMessagesHelper().sendMessage(of2);
            snVar.B6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.sn) this.f26332a.f30730f0).jb(arrayList, str, z10, i10, j10, z11);
    }
}
