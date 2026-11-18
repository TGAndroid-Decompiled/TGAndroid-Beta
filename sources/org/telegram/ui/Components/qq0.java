package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class qq0 implements org.telegram.ui.e50 {
    public final gt0 f38886a;

    public qq0(gt0 gt0Var) {
        this.f38886a = gt0Var;
    }

    @Override
    public final void c(org.telegram.ui.f50 f50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        f50Var.presentFragment(new org.telegram.ui.bn(bundle), true);
        ur0 ur0Var = this.f38886a.S;
        org.telegram.ui.ActionBar.h2 h2Var = ur0Var.f40408r.f35642y1;
        if (ur0Var.f40407n != 0) {
            h2Var.getConnectionsManager().cancelRequest(ur0Var.f40407n, true);
            ur0Var.f40407n = 0;
        }
        ur0Var.d.clear();
        ur0Var.f40405e = false;
        ur0Var.h = false;
        ur0Var.E(0L);
        TLRPC.User c22 = h2Var.getMessagesController().c2(Long.valueOf(ur0Var.F()));
        if (c22 != null) {
            h2Var.getMessagesController().c3(c22, h2Var.getClassGuid(), true, null);
        }
    }
}
