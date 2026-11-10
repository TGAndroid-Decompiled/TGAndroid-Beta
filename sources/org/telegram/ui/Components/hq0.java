package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.tgnet.TLRPC;
public final class hq0 implements org.telegram.ui.f50 {
    public final ys0 f34439a;

    public hq0(ys0 ys0Var) {
        this.f34439a = ys0Var;
    }

    @Override
    public final void e(org.telegram.ui.g50 g50Var, long j3) {
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j3);
        bundle.putBoolean("just_created_chat", true);
        g50Var.presentFragment(new org.telegram.ui.cn(bundle), true);
        mr0 mr0Var = this.f34439a.R;
        org.telegram.ui.ActionBar.f2 f2Var = mr0Var.f36081r.f40719x1;
        if (mr0Var.f36080n != 0) {
            f2Var.getConnectionsManager().cancelRequest(mr0Var.f36080n, true);
            mr0Var.f36080n = 0;
        }
        mr0Var.d.clear();
        mr0Var.f36078e = false;
        mr0Var.h = false;
        mr0Var.E(0L);
        TLRPC.User a22 = f2Var.getMessagesController().a2(Long.valueOf(mr0Var.F()));
        if (a22 != null) {
            f2Var.getMessagesController().W2(a22, f2Var.getClassGuid(), true, null);
        }
    }
}
