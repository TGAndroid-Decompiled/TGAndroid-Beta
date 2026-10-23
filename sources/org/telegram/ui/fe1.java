package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class fe1 extends org.telegram.ui.Components.x70 {
    public final long A0;
    public final he1 B0;

    public fe1(he1 he1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, long j11) {
        super(context, i10, hVar, j10, o2Var, null);
        this.B0 = he1Var;
        this.A0 = j11;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.B0.f37836b.getMessagesController().getChat(Long.valueOf(this.A0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
