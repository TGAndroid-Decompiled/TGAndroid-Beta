package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class en implements ml, org.telegram.ui.ActionBar.z1 {
    public final Utilities.Callback f26012a;

    public en(Utilities.Callback callback) {
        this.f26012a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.f26012a.run(new sh.f(messageMedia));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Utilities.Callback callback = this.f26012a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
