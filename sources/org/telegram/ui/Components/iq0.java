package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class iq0 implements org.telegram.ui.b50 {
    public final ys0 f35686a;

    public iq0(ys0 ys0Var) {
        this.f35686a = ys0Var;
    }

    @Override
    public final void c(org.telegram.ui.c50 c50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        c50Var.presentFragment(new org.telegram.ui.an(bundle), true);
        mr0 mr0Var = this.f35686a.S;
        org.telegram.ui.ActionBar.e2 e2Var = mr0Var.f37367r.f42152y1;
        if (mr0Var.f37366n != 0) {
            e2Var.getConnectionsManager().cancelRequest(mr0Var.f37366n, true);
            mr0Var.f37366n = 0;
        }
        mr0Var.d.clear();
        mr0Var.f37364e = false;
        mr0Var.h = false;
        mr0Var.E(0L);
        TLRPC.User a22 = e2Var.getMessagesController().a2(Long.valueOf(mr0Var.F()));
        if (a22 != null) {
            e2Var.getMessagesController().W2(a22, e2Var.getClassGuid(), true, null);
        }
    }
}
