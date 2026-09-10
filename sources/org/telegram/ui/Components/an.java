package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class an implements gl, org.telegram.ui.ActionBar.c2 {
    public final Utilities.Callback f21543a;

    public an(Utilities.Callback callback) {
        this.f21543a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        this.f21543a.run(new qh.f(messageMedia));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Utilities.Callback callback = this.f21543a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
