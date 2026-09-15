package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class lf1 extends org.telegram.ui.Components.b70 {
    public final long A0;
    public final nf1 B0;

    public lf1(nf1 nf1Var, Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.n2 n2Var, long j10) {
        super(context, i10, iVar, j3, n2Var, null);
        this.B0 = nf1Var;
        this.A0 = j10;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.B0.f35971b.getMessagesController().getChat(Long.valueOf(this.A0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
