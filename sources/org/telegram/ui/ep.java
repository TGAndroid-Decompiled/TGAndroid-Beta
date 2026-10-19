package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class ep extends org.telegram.ui.Components.e90 {
    public final TLRPC.Chat f36739w;
    public final fp f36740x;

    public ep(fp fpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f36740x = fpVar;
        this.f36739w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.c90 c90Var) {
        ip ipVar = this.f36740x.d;
        if (ipVar.P) {
            return false;
        }
        ipVar.P = true;
        e(new eh(18, this, c90Var), new ai.x9(this, this.f36739w, z10, c90Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.d90 d90Var) {
        ip ipVar = this.f36740x.d;
        if (ipVar.O) {
            return false;
        }
        ipVar.O = true;
        e(new eh(18, this, d90Var), new ai.x9(this, this.f36739w, z10, d90Var, 14));
        return true;
    }

    public final void e(eh ehVar, Runnable runnable) {
        ip ipVar = this.f36740x.d;
        if (!ChatObject.isChannel(ipVar.f38064f)) {
            ipVar.getMessagesController().convertToMegaGroup(ipVar.getParentActivity(), this.f36739w.f20275id, ipVar, new m4.w0(22, this, runnable), ehVar);
        } else {
            runnable.run();
        }
    }
}
