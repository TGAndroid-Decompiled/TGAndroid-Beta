package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ss0 extends dq0 {
    public final org.telegram.ui.ActionBar.o2 X0;

    public ss0(Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = o2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new rm(this.X0, hVar, i10, 14), 100L);
    }
}
