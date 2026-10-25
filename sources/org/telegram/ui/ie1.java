package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class ie1 extends org.telegram.ui.Components.y70 {
    public final long A0;
    public final ke1 B0;

    public ie1(ke1 ke1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.r2 r2Var, long j11) {
        super(context, i10, hVar, j10, r2Var, null);
        this.B0 = ke1Var;
        this.A0 = j11;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.B0.f40924b.getMessagesController().getChat(Long.valueOf(this.A0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
