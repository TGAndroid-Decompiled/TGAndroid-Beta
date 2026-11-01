package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class mp extends org.telegram.ui.Components.y70 {
    public final TLRPC.Chat f39595x;
    public final np f39596y;

    public mp(np npVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f39596y = npVar;
        this.f39595x = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.w70 w70Var) {
        qp qpVar = this.f39596y.d;
        if (qpVar.P) {
            return false;
        }
        qpVar.P = true;
        e(new ch(20, this, w70Var), new kp(this, this.f39595x, z10, w70Var, 0));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.x70 x70Var) {
        qp qpVar = this.f39596y.d;
        if (qpVar.O) {
            return false;
        }
        qpVar.O = true;
        e(new ch(20, this, x70Var), new bi.n4(this, this.f39595x, z10, x70Var, 29));
        return true;
    }

    public final void e(ch chVar, Runnable runnable) {
        qp qpVar = this.f39596y.d;
        if (!org.telegram.messenger.w3.T(qpVar.f40872f)) {
            qpVar.getMessagesController().T(qpVar.getParentActivity(), this.f39595x.f19794id, qpVar, new ng.d(20, this, runnable), chVar);
        } else {
            runnable.run();
        }
    }
}
