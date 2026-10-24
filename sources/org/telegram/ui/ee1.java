package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class ee1 extends org.telegram.ui.Components.v70 {
    public final long A0;
    public final ge1 B0;

    public ee1(ge1 ge1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, long j11) {
        super(context, i10, hVar, j10, o2Var, null);
        this.B0 = ge1Var;
        this.A0 = j11;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.B0.f37552b.getMessagesController().getChat(Long.valueOf(this.A0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
