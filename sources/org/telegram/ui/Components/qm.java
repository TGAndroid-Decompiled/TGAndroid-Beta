package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qm implements uk, org.telegram.ui.ActionBar.c2 {
    public final Utilities.Callback f28212a;

    public qm(Utilities.Callback callback) {
        this.f28212a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        this.f28212a.run(new eh.g(messageMedia));
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Utilities.Callback callback = this.f28212a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
