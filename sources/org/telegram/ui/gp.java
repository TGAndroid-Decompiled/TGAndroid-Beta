package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class gp extends org.telegram.ui.Components.f90 {
    public final TLRPC.Chat f37642w;
    public final hp f37643x;

    public gp(hp hpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f37643x = hpVar;
        this.f37642w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.d90 d90Var) {
        kp kpVar = this.f37643x.d;
        if (kpVar.P) {
            return false;
        }
        kpVar.P = true;
        e(new eh(18, this, d90Var), new ai.x9(this, this.f37642w, z10, d90Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.e90 e90Var) {
        kp kpVar = this.f37643x.d;
        if (kpVar.O) {
            return false;
        }
        kpVar.O = true;
        e(new eh(18, this, e90Var), new ai.x9(this, this.f37642w, z10, e90Var, 15));
        return true;
    }

    public final void e(eh ehVar, Runnable runnable) {
        kp kpVar = this.f37643x.d;
        if (!ChatObject.isChannel(kpVar.f39023f)) {
            kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), this.f37642w.f20343id, kpVar, new m4.w0(22, this, runnable), ehVar);
        } else {
            runnable.run();
        }
    }
}
