package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class d91 extends org.telegram.ui.Components.a60 {
    public final long f46313v2;
    public final f91 f46314w2;

    public d91(f91 f91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.e2 e2Var, long j10) {
        super(context, i7, hVar, j3, e2Var, null);
        this.f46314w2 = f91Var;
        this.f46313v2 = j10;
    }

    @Override
    public final boolean R0() {
        TLRPC.Chat M0 = this.f46314w2.f47078b.getMessagesController().M0(Long.valueOf(this.f46313v2));
        if (M0 != null && org.telegram.messenger.t3.y(3, M0)) {
            return true;
        }
        return false;
    }
}
