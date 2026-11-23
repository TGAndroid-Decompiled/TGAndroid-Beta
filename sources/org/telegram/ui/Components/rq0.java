package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class rq0 implements org.telegram.ui.d50 {
    public final it0 f39392a;

    public rq0(it0 it0Var) {
        this.f39392a = it0Var;
    }

    @Override
    public final void d(org.telegram.ui.e50 e50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        e50Var.presentFragment(new org.telegram.ui.bn(bundle), true);
        vr0 vr0Var = this.f39392a.S;
        org.telegram.ui.ActionBar.g2 g2Var = vr0Var.f41420r.f36166y1;
        if (vr0Var.f41419n != 0) {
            g2Var.getConnectionsManager().cancelRequest(vr0Var.f41419n, true);
            vr0Var.f41419n = 0;
        }
        vr0Var.d.clear();
        vr0Var.f41417e = false;
        vr0Var.h = false;
        vr0Var.E(0L);
        TLRPC.User c22 = g2Var.getMessagesController().c2(Long.valueOf(vr0Var.F()));
        if (c22 != null) {
            g2Var.getMessagesController().c3(c22, g2Var.getClassGuid(), true, null);
        }
    }
}
