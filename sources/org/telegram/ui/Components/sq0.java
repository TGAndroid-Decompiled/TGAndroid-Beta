package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class sq0 implements org.telegram.ui.e50 {
    public final jt0 f39674a;

    public sq0(jt0 jt0Var) {
        this.f39674a = jt0Var;
    }

    @Override
    public final void c(org.telegram.ui.f50 f50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        f50Var.presentFragment(new org.telegram.ui.bn(bundle), true);
        wr0 wr0Var = this.f39674a.S;
        org.telegram.ui.ActionBar.g2 g2Var = wr0Var.f41885r.f36683y1;
        if (wr0Var.f41884n != 0) {
            g2Var.getConnectionsManager().cancelRequest(wr0Var.f41884n, true);
            wr0Var.f41884n = 0;
        }
        wr0Var.d.clear();
        wr0Var.f41882e = false;
        wr0Var.h = false;
        wr0Var.E(0L);
        TLRPC.User c22 = g2Var.getMessagesController().c2(Long.valueOf(wr0Var.F()));
        if (c22 != null) {
            g2Var.getMessagesController().c3(c22, g2Var.getClassGuid(), true, null);
        }
    }
}
