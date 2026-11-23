package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class or0 extends ap0 {
    public final org.telegram.ui.ActionBar.g2 V2;

    public or0(Context context, String str, String str2, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context, null, str, false, str2, false, h6Var);
        this.V2 = g2Var;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        org.telegram.messenger.g0.h3(new org.telegram.ui.f0(this.V2, hVar, i7, 20), 100L);
    }
}
