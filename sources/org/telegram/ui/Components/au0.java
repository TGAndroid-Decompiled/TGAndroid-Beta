package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class au0 extends jr0 {
    public final org.telegram.ui.ActionBar.m2 f23628b1;

    public au0(Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.m2 m2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.f23628b1 = m2Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.gm(this.f23628b1, hVar, i10, 16), 100L);
    }
}
