package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class i91 extends org.telegram.ui.Components.x50 {
    public final long f46585u2;
    public final k91 f46586v2;

    public i91(k91 k91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.f2 f2Var, long j10) {
        super(context, i7, hVar, j3, f2Var, null);
        this.f46586v2 = k91Var;
        this.f46585u2 = j10;
    }

    @Override
    public final boolean R0() {
        TLRPC.Chat M0 = this.f46586v2.f47236b.getMessagesController().M0(Long.valueOf(this.f46585u2));
        if (M0 != null && org.telegram.messenger.t3.y(3, M0)) {
            return true;
        }
        return false;
    }
}
