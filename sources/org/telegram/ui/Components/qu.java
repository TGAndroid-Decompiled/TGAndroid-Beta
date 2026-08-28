package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class qu extends rp0 {
    public final dv X0;

    public qu(dv dvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, str, false, str2, false, b6Var);
        this.X0 = dvVar;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(this, hVar, i9, 2), 100L);
    }
}
