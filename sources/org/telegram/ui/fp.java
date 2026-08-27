package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC;

public final class fp extends org.telegram.ui.Components.x70 {

    public final TLRPC.Chat f38178w;

    public final gp f38179x;

    public fp(gp gpVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f38179x = gpVar;
        this.f38178w = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.v70 v70Var) {
        jp jpVar = this.f38179x.d;
        if (jpVar.L) {
            return false;
        }
        jpVar.L = true;
        e(new rd(27, this, v70Var), new cg.c(this, this.f38178w, z10, v70Var, 12));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.w70 w70Var) {
        jp jpVar = this.f38179x.d;
        if (jpVar.K) {
            return false;
        }
        jpVar.K = true;
        e(new rd(27, this, w70Var), new cg.c(this, this.f38178w, z10, w70Var, 11));
        return true;
    }

    public final void e(rd rdVar, Runnable runnable) {
        jp jpVar = this.f38179x.d;
        if (ChatObject.isChannel(jpVar.f39454f)) {
            runnable.run();
        } else {
            jpVar.getMessagesController().convertToMegaGroup(jpVar.getParentActivity(), this.f38178w.f22380id, jpVar, new jh.z1(25, this, runnable), rdVar);
        }
    }
}
