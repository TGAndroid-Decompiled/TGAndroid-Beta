package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class ci implements oj {
    public final ti f27180a;

    public ci(ti tiVar) {
        this.f27180a = tiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.un unVar = (org.telegram.ui.un) this.f27180a.f33018f0;
        if (unVar.m7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, unVar.f44249f6, unVar.f44498z5, unVar.f44295j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = unVar.L8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = unVar.X8();
            of2.suggestionParams = unVar.f44407s5;
            unVar.getSendMessagesHelper().sendMessage(of2);
            unVar.D6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.un) this.f27180a.f33018f0).ob(arrayList, str, z10, i10, j10, z11);
    }
}
