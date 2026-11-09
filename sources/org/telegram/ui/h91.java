package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class h91 extends org.telegram.ui.Components.y50 {
    public final long f46264r2;
    public final j91 f46265s2;

    public h91(j91 j91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, long j10) {
        super(context, i7, hVar, j3, f2Var, null);
        this.f46265s2 = j91Var;
        this.f46264r2 = j10;
    }

    @Override
    public final boolean R0() {
        TLRPC.Chat M0 = this.f46265s2.f46898b.getMessagesController().M0(Long.valueOf(this.f46264r2));
        if (M0 != null && org.telegram.messenger.t3.y(3, M0)) {
            return true;
        }
        return false;
    }
}
