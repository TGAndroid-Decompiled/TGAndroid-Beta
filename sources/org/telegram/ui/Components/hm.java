package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class hm implements ok, org.telegram.ui.ActionBar.a2 {

    public final Utilities.Callback f29058a;

    public hm(Utilities.Callback callback) {
        this.f29058a = callback;
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.f29058a.run(new ah.g(messageMedia));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        Utilities.Callback callback = this.f29058a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
