package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cn implements kl, org.telegram.ui.ActionBar.z1 {
    public final Utilities.Callback f25353a;

    public cn(Utilities.Callback callback) {
        this.f25353a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.f25353a.run(new sh.f(messageMedia));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Utilities.Callback callback = this.f25353a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
