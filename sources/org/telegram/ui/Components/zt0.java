package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class zt0 extends hr0 {
    public final org.telegram.ui.ActionBar.o2 f33355e1;

    public zt0(Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.f33355e1 = o2Var;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(this.f33355e1, hVar, i10, 20), 100L);
    }
}
