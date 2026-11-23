package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class f91 extends org.telegram.ui.Components.i60 {
    public final long f47732v2;
    public final h91 f47733w2;

    public f91(h91 h91Var, Context context, int i7, a0.h hVar, long j3, org.telegram.ui.ActionBar.g2 g2Var, long j10) {
        super(context, i7, hVar, j3, g2Var, null);
        this.f47733w2 = h91Var;
        this.f47732v2 = j10;
    }

    @Override
    public final boolean S0() {
        TLRPC.Chat O0 = this.f47733w2.f48513b.getMessagesController().O0(Long.valueOf(this.f47732v2));
        if (O0 != null && org.telegram.messenger.v3.y(3, O0)) {
            return true;
        }
        return false;
    }
}
