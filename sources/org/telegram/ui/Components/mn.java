package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class mn implements ul, org.telegram.ui.ActionBar.z1 {
    public final Utilities.Callback f28603a;

    public mn(Utilities.Callback callback) {
        this.f28603a = callback;
    }

    @Override
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        this.f28603a.run(new rh.f(messageMedia));
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        Utilities.Callback callback = this.f28603a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
