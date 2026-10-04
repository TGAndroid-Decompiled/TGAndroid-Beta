package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class pp extends org.telegram.ui.Components.y80 {
    public final TLRPC.Chat f39522w;
    public final qp f39523x;

    public pp(qp qpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f39523x = qpVar;
        this.f39522w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.w80 w80Var) {
        tp tpVar = this.f39523x.d;
        if (tpVar.P) {
            return false;
        }
        tpVar.P = true;
        e(new oh(19, this, w80Var), new ai.s4(this, this.f39522w, z10, w80Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.x80 x80Var) {
        tp tpVar = this.f39523x.d;
        if (tpVar.O) {
            return false;
        }
        tpVar.O = true;
        e(new oh(19, this, x80Var), new ai.s4(this, this.f39522w, z10, x80Var, 15));
        return true;
    }

    public final void e(oh ohVar, Runnable runnable) {
        tp tpVar = this.f39523x.d;
        if (!ChatObject.isChannel(tpVar.f40923f)) {
            tpVar.getMessagesController().convertToMegaGroup(tpVar.getParentActivity(), this.f39522w.f20037id, tpVar, new o(19, this, runnable), ohVar);
        } else {
            runnable.run();
        }
    }
}
