package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class km implements sk, org.telegram.ui.ActionBar.b2 {
    public final Utilities.Callback f30201a;

    public km(Utilities.Callback callback) {
        this.f30201a = callback;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        this.f30201a.run(new zg.f(messageMedia));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        Utilities.Callback callback = this.f30201a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
