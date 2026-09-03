package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class wh implements gj {
    public final li f30258a;

    public wh(li liVar) {
        this.f30258a = liVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z4, int i10, long j10) {
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f30258a.f26685c0;
        if (znVar.f7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, znVar.Q5, znVar.f40642k5, znVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
            of2.sendMessageChatArguments = znVar.C8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j10;
            of2.monoForumPeer = znVar.N8();
            of2.suggestionParams = znVar.f40555d5;
            znVar.getSendMessagesHelper().sendMessage(of2);
            znVar.y6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
        ((org.telegram.ui.zn) this.f30258a.f26685c0).db(arrayList, str, z4, i10, j10, z10);
    }
}
