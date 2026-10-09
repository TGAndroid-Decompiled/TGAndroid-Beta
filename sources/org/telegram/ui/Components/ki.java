package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.TLRPC;
public final class ki implements tj {
    public final yi f28012a;

    public ki(yi yiVar) {
        this.f28012a = yiVar;
    }

    @Override
    public final void a(TLRPC.User user, boolean z10, int i10, long j3) {
        org.telegram.ui.zn znVar = (org.telegram.ui.zn) this.f28012a.f33228f0;
        if (znVar.i7()) {
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(user, znVar.T5, znVar.f44868n5, znVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
            of2.sendMessageChatArguments = znVar.H8();
            of2.effect_id = 0L;
            of2.invert_media = false;
            of2.payStars = j3;
            of2.monoForumPeer = znVar.S8();
            of2.suggestionParams = znVar.f44783g5;
            znVar.getSendMessagesHelper().sendMessage(of2);
            znVar.B6();
        }
    }

    @Override
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        ((org.telegram.ui.zn) this.f28012a.f33228f0).hb(arrayList, str, z10, i10, j3, z11);
    }
}
