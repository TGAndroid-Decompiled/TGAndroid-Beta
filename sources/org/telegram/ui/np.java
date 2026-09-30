package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class np extends org.telegram.ui.Components.y80 {
    public final TLRPC.Chat f36090w;
    public final op f36091x;

    public np(op opVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f36091x = opVar;
        this.f36090w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.w80 w80Var) {
        rp rpVar = this.f36091x.d;
        if (rpVar.P) {
            return false;
        }
        rpVar.P = true;
        e(new fh(20, this, w80Var), new ai.s4(this, this.f36090w, z10, w80Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.x80 x80Var) {
        rp rpVar = this.f36091x.d;
        if (rpVar.O) {
            return false;
        }
        rpVar.O = true;
        e(new fh(20, this, x80Var), new ai.s4(this, this.f36090w, z10, x80Var, 15));
        return true;
    }

    public final void e(fh fhVar, Runnable runnable) {
        rp rpVar = this.f36091x.d;
        if (!ChatObject.isChannel(rpVar.f37522f)) {
            rpVar.getMessagesController().convertToMegaGroup(rpVar.getParentActivity(), this.f36090w.f18352id, rpVar, new o(18, this, runnable), fhVar);
        } else {
            runnable.run();
        }
    }
}
