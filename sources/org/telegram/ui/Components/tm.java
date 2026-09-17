package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class tm implements bl, org.telegram.ui.ActionBar.b2 {
    public final Utilities.Callback f28168a;

    public tm(Utilities.Callback callback) {
        this.f28168a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        this.f28168a.run(new rh.f(messageMedia));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Utilities.Callback callback = this.f28168a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
