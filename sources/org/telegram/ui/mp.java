package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class mp extends org.telegram.ui.Components.m80 {
    public final TLRPC.Chat f36364w;
    public final np f36365x;

    public mp(np npVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f36365x = npVar;
        this.f36364w = chat2;
    }

    @Override
    public final boolean a(boolean z4, org.telegram.ui.Components.k80 k80Var) {
        qp qpVar = this.f36365x.d;
        if (qpVar.M) {
            return false;
        }
        qpVar.M = true;
        e(new hp(3, this, k80Var), new cg.u0(this, this.f36364w, z4, k80Var, 11));
        return true;
    }

    @Override
    public final boolean b(boolean z4, org.telegram.ui.Components.l80 l80Var) {
        qp qpVar = this.f36365x.d;
        if (qpVar.L) {
            return false;
        }
        qpVar.L = true;
        e(new hp(3, this, l80Var), new cg.u0(this, this.f36364w, z4, l80Var, 10));
        return true;
    }

    public final void e(hp hpVar, Runnable runnable) {
        qp qpVar = this.f36365x.d;
        if (!ChatObject.isChannel(qpVar.f37806f)) {
            qpVar.getMessagesController().convertToMegaGroup(qpVar.getParentActivity(), this.f36364w.f19184id, qpVar, new mg.w(24, this, runnable), hpVar);
        } else {
            runnable.run();
        }
    }
}
