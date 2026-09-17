package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tm implements bl, org.telegram.ui.ActionBar.a2 {
    public final Utilities.Callback f30649a;

    public tm(Utilities.Callback callback) {
        this.f30649a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        this.f30649a.run(new sh.f(messageMedia));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Utilities.Callback callback = this.f30649a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
