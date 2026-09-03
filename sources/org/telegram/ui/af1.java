package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class af1 extends org.telegram.ui.Components.e70 {
    public final long f35168x0;
    public final cf1 f35169y0;

    public af1(cf1 cf1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, long j11) {
        super(context, i10, hVar, j10, p2Var, null);
        this.f35169y0 = cf1Var;
        this.f35168x0 = j11;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.f35169y0.f35788b.getMessagesController().getChat(Long.valueOf(this.f35168x0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
