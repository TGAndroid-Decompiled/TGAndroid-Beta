package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tm implements bl, org.telegram.ui.ActionBar.a2 {
    public final Utilities.Callback f28430a;

    public tm(Utilities.Callback callback) {
        this.f28430a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        this.f28430a.run(new rh.f(messageMedia));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Utilities.Callback callback = this.f28430a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
