package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class ci implements oj {
    public final ti f27164a;

    public ci(ti tiVar) {
        this.f27164a = tiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.wn wnVar = (org.telegram.ui.wn) this.f27164a.f32990f0;
        if (wnVar.o7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, wnVar.f45168j6, wnVar.D5, wnVar.f45166j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = wnVar.O8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = wnVar.a9();
            of2.suggestionParams = wnVar.f45330w5;
            wnVar.getSendMessagesHelper().sendMessage(of2);
            wnVar.E6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.wn) this.f27164a.f32990f0).sb(arrayList, str, z10, i10, j10, z11);
    }
}
