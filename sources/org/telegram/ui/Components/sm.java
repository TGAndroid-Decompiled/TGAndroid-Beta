package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class sm implements wk, org.telegram.ui.ActionBar.c2 {
    public final Utilities.Callback f31133a;

    public sm(Utilities.Callback callback) {
        this.f31133a = callback;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        this.f31133a.run(new fh.g(messageMedia));
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Utilities.Callback callback = this.f31133a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
