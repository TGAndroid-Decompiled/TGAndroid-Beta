package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class iq0 implements org.telegram.ui.e50 {
    public final zs0 f34839a;

    public iq0(zs0 zs0Var) {
        this.f34839a = zs0Var;
    }

    @Override
    public final void e(org.telegram.ui.f50 f50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        f50Var.presentFragment(new org.telegram.ui.cn(bundle), true);
        nr0 nr0Var = this.f34839a.R;
        org.telegram.ui.ActionBar.f2 f2Var = nr0Var.f36489r.f41127x1;
        if (nr0Var.f36488n != 0) {
            f2Var.getConnectionsManager().cancelRequest(nr0Var.f36488n, true);
            nr0Var.f36488n = 0;
        }
        nr0Var.d.clear();
        nr0Var.f36486e = false;
        nr0Var.h = false;
        nr0Var.E(0L);
        TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(nr0Var.F()));
        if (a22 != null) {
            f2Var.getMessagesController().W2(a22, f2Var.getClassGuid(), true, null);
        }
    }
}
