package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class gp extends org.telegram.ui.Components.g80 {
    public final TLRPC.Chat f38645w;
    public final hp f38646x;

    public gp(hp hpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f38646x = hpVar;
        this.f38645w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.e80 e80Var) {
        kp kpVar = this.f38646x.d;
        if (kpVar.L) {
            return false;
        }
        kpVar.L = true;
        e(new vf(24, this, e80Var), new ag.w0(this, this.f38645w, z10, e80Var, 13));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.f80 f80Var) {
        kp kpVar = this.f38646x.d;
        if (kpVar.K) {
            return false;
        }
        kpVar.K = true;
        e(new vf(24, this, f80Var), new ag.w0(this, this.f38645w, z10, f80Var, 12));
        return true;
    }

    public final void e(vf vfVar, Runnable runnable) {
        kp kpVar = this.f38646x.d;
        if (!ChatObject.isChannel(kpVar.f39981f)) {
            kpVar.getMessagesController().convertToMegaGroup(kpVar.getParentActivity(), this.f38645w.f22392id, kpVar, new kg.w(25, this, runnable), vfVar);
        } else {
            runnable.run();
        }
    }
}
