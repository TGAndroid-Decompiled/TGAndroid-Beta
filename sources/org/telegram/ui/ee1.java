package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

public final class ee1 extends org.telegram.ui.Components.p60 {

    public final long f37746w0;

    public final ge1 f37747x0;

    public ee1(ge1 ge1Var, Context context, int i10, a0.h hVar, long j10, org.telegram.ui.ActionBar.n2 n2Var, long j11) {
        super(context, i10, hVar, j10, n2Var, null);
        this.f37747x0 = ge1Var;
        this.f37746w0 = j11;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.f37747x0.f38398b.getMessagesController().getChat(Long.valueOf(this.f37746w0));
        return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
    }
}
