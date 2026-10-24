package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class lv extends hr0 {
    public final yv f28438e1;

    public lv(yv yvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.f28438e1 = yvVar;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.h4(this, hVar, i10, 7), 100L);
    }
}
