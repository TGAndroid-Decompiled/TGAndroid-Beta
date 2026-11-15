package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class po extends org.telegram.ui.Components.i70 {
    public final TLRPC.Chat f50319x;
    public final qo f50320y;

    public po(qo qoVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f50320y = qoVar;
        this.f50319x = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.g70 g70Var) {
        to toVar = this.f50320y.d;
        if (toVar.Q) {
            return false;
        }
        toVar.Q = true;
        e(new zg(15, this, g70Var), new wn(this, this.f50319x, z10, g70Var, 2));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.h70 h70Var) {
        to toVar = this.f50320y.d;
        if (toVar.P) {
            return false;
        }
        toVar.P = true;
        e(new zg(15, this, h70Var), new wn(this, this.f50319x, z10, h70Var, 1));
        return true;
    }

    public final void e(zg zgVar, Runnable runnable) {
        to toVar = this.f50320y.d;
        if (!org.telegram.messenger.t3.T(toVar.f51622f)) {
            toVar.getMessagesController().T(toVar.getParentActivity(), this.f50319x.f28051id, toVar, new m2.d(24, this, runnable), zgVar);
        } else {
            runnable.run();
        }
    }
}
