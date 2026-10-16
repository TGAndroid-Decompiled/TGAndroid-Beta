package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class hn implements ol, org.telegram.ui.ActionBar.z1 {
    public final Utilities.Callback f25363a;

    public hn(Utilities.Callback callback) {
        this.f25363a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.f25363a.run(new sh.f(messageMedia));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        Utilities.Callback callback = this.f25363a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
