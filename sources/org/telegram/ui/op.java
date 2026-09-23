package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;
public final class op extends org.telegram.ui.Components.l80 {
    public final TLRPC.Chat f35916w;
    public final pp f35917x;

    public op(pp ppVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f35917x = ppVar;
        this.f35916w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.j80 j80Var) {
        sp spVar = this.f35917x.d;
        if (spVar.P) {
            return false;
        }
        spVar.P = true;
        e(new rh(15, this, j80Var), new ai.s4(this, this.f35916w, z10, j80Var, 15));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.k80 k80Var) {
        sp spVar = this.f35917x.d;
        if (spVar.O) {
            return false;
        }
        spVar.O = true;
        e(new rh(15, this, k80Var), new ai.s4(this, this.f35916w, z10, k80Var, 14));
        return true;
    }

    public final void e(rh rhVar, Runnable runnable) {
        sp spVar = this.f35917x.d;
        if (!ChatObject.isChannel(spVar.f37383f)) {
            spVar.getMessagesController().convertToMegaGroup(spVar.getParentActivity(), this.f35916w.f18083id, spVar, new u(17, this, runnable), rhVar);
        } else {
            runnable.run();
        }
    }
}
