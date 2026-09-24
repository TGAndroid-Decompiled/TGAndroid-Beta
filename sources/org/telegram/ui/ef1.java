package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class ef1 extends org.telegram.ui.Components.m70 {
    public final long A0;
    public final gf1 B0;

    public ef1(gf1 gf1Var, Context context, int i10, a0.i iVar, long j3, org.telegram.ui.ActionBar.m2 m2Var, long j10) {
        super(context, i10, iVar, j3, m2Var, null);
        this.B0 = gf1Var;
        this.A0 = j10;
    }

    @Override
    public final boolean X() {
        TLRPC.Chat chat = this.B0.f33917b.getMessagesController().getChat(Long.valueOf(this.A0));
        if (chat != null && ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return false;
    }
}
