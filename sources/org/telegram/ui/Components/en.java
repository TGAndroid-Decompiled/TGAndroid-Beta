package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class en implements ml, org.telegram.ui.ActionBar.a2 {
    public final Utilities.Callback f25953a;

    public en(Utilities.Callback callback) {
        this.f25953a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.f25953a.run(new sh.f(messageMedia));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Utilities.Callback callback = this.f25953a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
