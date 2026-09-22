package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tm implements bl, org.telegram.ui.ActionBar.a2 {
    public final Utilities.Callback f28497a;

    public tm(Utilities.Callback callback) {
        this.f28497a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        this.f28497a.run(new rh.f(messageMedia));
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Utilities.Callback callback = this.f28497a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
