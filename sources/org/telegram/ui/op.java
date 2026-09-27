package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class op extends org.telegram.ui.Components.x80 {
    public final TLRPC.Chat f36234w;
    public final pp f36235x;

    public op(pp ppVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f36235x = ppVar;
        this.f36234w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.v80 v80Var) {
        sp spVar = this.f36235x.d;
        if (spVar.P) {
            return false;
        }
        spVar.P = true;
        e(new qh(18, this, v80Var), new ai.s4(this, this.f36234w, z10, v80Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.w80 w80Var) {
        sp spVar = this.f36235x.d;
        if (spVar.O) {
            return false;
        }
        spVar.O = true;
        e(new qh(18, this, w80Var), new ai.s4(this, this.f36234w, z10, w80Var, 15));
        return true;
    }

    public final void e(qh qhVar, Runnable runnable) {
        sp spVar = this.f36235x.d;
        if (!ChatObject.isChannel(spVar.f37543f)) {
            spVar.getMessagesController().convertToMegaGroup(spVar.getParentActivity(), this.f36234w.f18329id, spVar, new p(18, this, runnable), qhVar);
        } else {
            runnable.run();
        }
    }
}
