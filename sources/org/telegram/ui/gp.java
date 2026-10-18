package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class gp extends org.telegram.ui.Components.e90 {
    public final TLRPC.Chat f37256w;
    public final hp f37257x;

    public gp(hp hpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f37257x = hpVar;
        this.f37256w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.c90 c90Var) {
        kp kpVar = this.f37257x.d;
        if (kpVar.P) {
            return false;
        }
        kpVar.P = true;
        e(new gh(18, this, c90Var), new ai.x9(this, this.f37256w, z10, c90Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.d90 d90Var) {
        kp kpVar = this.f37257x.d;
        if (kpVar.O) {
            return false;
        }
        kpVar.O = true;
        e(new gh(18, this, d90Var), new ai.x9(this, this.f37256w, z10, d90Var, 14));
        return true;
    }

    public final void e(gh ghVar, Runnable runnable) {
        kp kpVar = this.f37257x.d;
        if (!ChatObject.isChannel(kpVar.f38586f)) {
            kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), this.f37256w.f20272id, kpVar, new m4.w0(22, this, runnable), ghVar);
        } else {
            runnable.run();
        }
    }
}
