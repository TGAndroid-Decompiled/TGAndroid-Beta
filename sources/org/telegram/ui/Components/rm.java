package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class rm implements uk, org.telegram.ui.ActionBar.c2 {
    public final Utilities.Callback f28493a;

    public rm(Utilities.Callback callback) {
        this.f28493a = callback;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        this.f28493a.run(new eh.g(messageMedia));
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Utilities.Callback callback = this.f28493a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
