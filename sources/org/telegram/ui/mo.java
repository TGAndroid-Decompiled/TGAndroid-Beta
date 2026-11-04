package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class mo extends org.telegram.ui.Components.b70 {
    public final TLRPC.Chat f47717x;
    public final no f47718y;

    public mo(no noVar, Context context, TLRPC.Chat chat, TLRPC.Chat chat2) {
        super(context, chat);
        this.f47718y = noVar;
        this.f47717x = chat2;
    }

    @Override
    public final boolean a(boolean z10, org.telegram.ui.Components.z60 z60Var) {
        qo qoVar = this.f47718y.d;
        if (qoVar.Q) {
            return false;
        }
        qoVar.Q = true;
        e(new lo(1, this, z60Var), new rn(this, this.f47717x, z10, z60Var, 2));
        return true;
    }

    @Override
    public final boolean b(boolean z10, org.telegram.ui.Components.a70 a70Var) {
        qo qoVar = this.f47718y.d;
        if (qoVar.P) {
            return false;
        }
        qoVar.P = true;
        e(new lo(1, this, a70Var), new rn(this, this.f47717x, z10, a70Var, 1));
        return true;
    }

    public final void e(lo loVar, Runnable runnable) {
        qo qoVar = this.f47718y.d;
        if (!org.telegram.messenger.t3.T(qoVar.f48924f)) {
            qoVar.getMessagesController().T(qoVar.getParentActivity(), this.f47717x.f27001id, qoVar, new jo(0, this, runnable), loVar);
        } else {
            runnable.run();
        }
    }
}
