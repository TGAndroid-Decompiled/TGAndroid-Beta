package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class mr0 extends yo0 {
    public final org.telegram.ui.ActionBar.h2 V2;

    public mr0(Context context, String str, String str2, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.ActionBar.h2 h2Var) {
        super(context, null, str, false, str2, false, i6Var);
        this.V2 = h2Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.b0(this.V2, hVar, i7, 21), 100L);
    }
}
