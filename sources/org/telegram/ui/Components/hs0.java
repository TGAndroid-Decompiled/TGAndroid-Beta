package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class hs0 extends rp0 {
    public final org.telegram.ui.ActionBar.o2 X0;

    public hs0(Context context, String str, String str2, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, b6Var);
        this.X0 = o2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i9, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new org.telegram.ui.rl(this.X0, hVar, i9, 15), 100L);
    }
}
