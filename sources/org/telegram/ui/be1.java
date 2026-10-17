package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class be1 extends org.telegram.ui.Components.v70 {
    public final long A0;
    public final de1 B0;

    public be1(de1 de1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.n2 n2Var, long j11) {
        super(context, i10, hVar, j10, n2Var, null);
        this.B0 = de1Var;
        this.A0 = j11;
    }

    @Override
    public final boolean Y() {
        TLRPC.Chat chat = this.B0.f36182b.getMessagesController().getChat(Long.valueOf(this.A0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
