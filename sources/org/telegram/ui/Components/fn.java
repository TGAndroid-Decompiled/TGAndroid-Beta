package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class fn implements nl, org.telegram.ui.ActionBar.b2 {
    public final Utilities.Callback f28278a;

    public fn(Utilities.Callback callback) {
        this.f28278a = callback;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.f28278a.run(new th.f(messageMedia));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        Utilities.Callback callback = this.f28278a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
