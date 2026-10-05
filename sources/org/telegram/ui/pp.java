package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class pp extends org.telegram.ui.Components.y80 {
    public final TLRPC.Chat f39612w;
    public final qp f39613x;

    public pp(qp qpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f39613x = qpVar;
        this.f39612w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.w80 w80Var) {
        tp tpVar = this.f39613x.d;
        if (tpVar.P) {
            return false;
        }
        tpVar.P = true;
        e(new oh(19, this, w80Var), new ai.s4(this, this.f39612w, z10, w80Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.x80 x80Var) {
        tp tpVar = this.f39613x.d;
        if (tpVar.O) {
            return false;
        }
        tpVar.O = true;
        e(new oh(19, this, x80Var), new ai.s4(this, this.f39612w, z10, x80Var, 15));
        return true;
    }

    public final void e(oh ohVar, Runnable runnable) {
        tp tpVar = this.f39613x.d;
        if (!ChatObject.isChannel(tpVar.f40986f)) {
            tpVar.getMessagesController().convertToMegaGroup(tpVar.getParentActivity(), this.f39612w.f20047id, tpVar, new o(19, this, runnable), ohVar);
        } else {
            runnable.run();
        }
    }
}
