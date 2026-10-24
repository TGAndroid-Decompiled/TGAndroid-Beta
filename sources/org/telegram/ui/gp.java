package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class gp extends org.telegram.ui.Components.d90 {
    public final TLRPC.Chat f37620w;
    public final hp f37621x;

    public gp(hp hpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f37621x = hpVar;
        this.f37620w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.b90 b90Var) {
        kp kpVar = this.f37621x.d;
        if (kpVar.P) {
            return false;
        }
        kpVar.P = true;
        e(new eh(18, this, b90Var), new ai.x9(this, this.f37620w, z10, b90Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.c90 c90Var) {
        kp kpVar = this.f37621x.d;
        if (kpVar.O) {
            return false;
        }
        kpVar.O = true;
        e(new eh(18, this, c90Var), new ai.x9(this, this.f37620w, z10, c90Var, 15));
        return true;
    }

    public final void e(eh ehVar, Runnable runnable) {
        kp kpVar = this.f37621x.d;
        if (!ChatObject.isChannel(kpVar.f38991f)) {
            kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), this.f37620w.f20344id, kpVar, new m4.w0(22, this, runnable), ehVar);
        } else {
            runnable.run();
        }
    }
}
