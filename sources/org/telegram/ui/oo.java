package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class oo extends org.telegram.ui.Components.f70 {
    public final TLRPC.Chat f48433x;
    public final po f48434y;

    public oo(po poVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f48434y = poVar;
        this.f48433x = chat2;
    }

    @Override
    public final boolean a(boolean z9, org.telegram.ui.Components.d70 d70Var) {
        so soVar = this.f48434y.d;
        if (soVar.P) {
            return false;
        }
        soVar.P = true;
        e(new qf(26, this, d70Var), new vn(this, this.f48433x, z9, d70Var, 2));
        return true;
    }

    @Override
    public final boolean b(boolean z9, org.telegram.ui.Components.e70 e70Var) {
        so soVar = this.f48434y.d;
        if (soVar.O) {
            return false;
        }
        soVar.O = true;
        e(new qf(26, this, e70Var), new vn(this, this.f48433x, z9, e70Var, 1));
        return true;
    }

    public final void e(qf qfVar, Runnable runnable) {
        so soVar = this.f48434y.d;
        if (!org.telegram.messenger.t3.T(soVar.f49780f)) {
            soVar.getMessagesController().T(soVar.getParentActivity(), this.f48433x.f26952id, soVar, new ni.c(20, this, runnable), qfVar);
        } else {
            runnable.run();
        }
    }
}
