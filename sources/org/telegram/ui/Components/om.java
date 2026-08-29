package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class om implements wk, org.telegram.ui.ActionBar.b2 {
    public final Utilities.Callback f31390a;

    public om(Utilities.Callback callback) {
        this.f31390a = callback;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.f31390a.run(new ch.g(messageMedia));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Utilities.Callback callback = this.f31390a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
