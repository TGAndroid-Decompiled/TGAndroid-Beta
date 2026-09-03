package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class af1 extends org.telegram.ui.Components.d70 {
    public final long f32578x0;
    public final cf1 f32579y0;

    public af1(cf1 cf1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.p2 p2Var, long j11) {
        super(context, i10, hVar, j10, p2Var, null);
        this.f32579y0 = cf1Var;
        this.f32578x0 = j11;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.f32579y0.f33137b.getMessagesController().getChat(Long.valueOf(this.f32578x0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
