package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class qf1 extends org.telegram.ui.Components.k70 {
    public final long A0;
    public final sf1 B0;

    public qf1(sf1 sf1Var, Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.p2 p2Var, long j10) {
        super(context, i10, iVar, j3, p2Var, null);
        this.B0 = sf1Var;
        this.A0 = j10;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.B0.f36673b.getMessagesController().getChat(Long.valueOf(this.A0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
