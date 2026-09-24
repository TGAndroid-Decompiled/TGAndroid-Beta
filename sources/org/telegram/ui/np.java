package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class np extends org.telegram.ui.Components.v80 {
    public final TLRPC.Chat f35910w;
    public final op f35911x;

    public np(op opVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f35911x = opVar;
        this.f35910w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.t80 t80Var) {
        rp rpVar = this.f35911x.d;
        if (rpVar.P) {
            return false;
        }
        rpVar.P = true;
        e(new dh(21, this, t80Var), new ai.s4(this, this.f35910w, z10, t80Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.u80 u80Var) {
        rp rpVar = this.f35911x.d;
        if (rpVar.O) {
            return false;
        }
        rpVar.O = true;
        e(new dh(21, this, u80Var), new ai.s4(this, this.f35910w, z10, u80Var, 15));
        return true;
    }

    public final void e(dh dhVar, Runnable runnable) {
        rp rpVar = this.f35911x.d;
        if (!ChatObject.isChannel(rpVar.f37416f)) {
            rpVar.getMessagesController().convertToMegaGroup(rpVar.getParentActivity(), this.f35910w.f18321id, rpVar, new o(18, this, runnable), dhVar);
        } else {
            runnable.run();
        }
    }
}
