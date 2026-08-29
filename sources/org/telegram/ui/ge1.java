package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class ge1 extends org.telegram.ui.Components.x60 {
    public final long f38571w0;
    public final ie1 f38572x0;

    public ge1(ie1 ie1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.o2 o2Var, long j11) {
        super(context, i10, hVar, j10, o2Var, null);
        this.f38572x0 = ie1Var;
        this.f38571w0 = j11;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.f38572x0.f39228b.getMessagesController().getChat(Long.valueOf(this.f38571w0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
