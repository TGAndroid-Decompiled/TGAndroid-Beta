package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class de1 extends org.telegram.ui.Components.k60 {
    public final long f37522w0;
    public final fe1 f37523x0;

    public de1(fe1 fe1Var, Context context, int i9, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, long j11) {
        super(context, i9, hVar, j10, o2Var, null);
        this.f37523x0 = fe1Var;
        this.f37522w0 = j11;
    }

    @Override
    public final boolean W() {
        TLRPC.Chat chat = this.f37523x0.f38246b.getMessagesController().getChat(Long.valueOf(this.f37522w0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
