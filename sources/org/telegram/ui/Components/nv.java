package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class nv extends mr0 {
    public final aw f31083a1;

    public nv(aw awVar, Context context, String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, str, false, str2, false, u6Var);
        this.f31083a1 = awVar;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.g4(this, hVar, i10, 7), 100L);
    }
}
