package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class np extends org.telegram.ui.Components.x80 {
    public final TLRPC.Chat f35927w;
    public final op f35928x;

    public np(op opVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f35928x = opVar;
        this.f35927w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.v80 v80Var) {
        rp rpVar = this.f35928x.d;
        if (rpVar.P) {
            return false;
        }
        rpVar.P = true;
        e(new dh(21, this, v80Var), new ai.s4(this, this.f35927w, z10, v80Var, 16));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.w80 w80Var) {
        rp rpVar = this.f35928x.d;
        if (rpVar.O) {
            return false;
        }
        rpVar.O = true;
        e(new dh(21, this, w80Var), new ai.s4(this, this.f35927w, z10, w80Var, 15));
        return true;
    }

    public final void e(dh dhVar, Runnable runnable) {
        rp rpVar = this.f35928x.d;
        if (!ChatObject.isChannel(rpVar.f37429f)) {
            rpVar.getMessagesController().convertToMegaGroup(rpVar.getParentActivity(), this.f35927w.f18337id, rpVar, new o(18, this, runnable), dhVar);
        } else {
            runnable.run();
        }
    }
}
