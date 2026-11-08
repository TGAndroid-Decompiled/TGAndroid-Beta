package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class g91 extends org.telegram.ui.Components.x50 {
    public final long f45917r2;
    public final i91 f45918s2;

    public g91(i91 i91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, long j10) {
        super(context, i7, hVar, j3, f2Var, null);
        this.f45918s2 = i91Var;
        this.f45917r2 = j10;
    }

    @Override
    public final boolean R0() {
        TLRPC.Chat M0 = this.f45918s2.f46613b.getMessagesController().M0(Long.valueOf(this.f45917r2));
        if (M0 != null && org.telegram.messenger.t3.y(3, M0)) {
            return true;
        }
        return false;
    }
}
