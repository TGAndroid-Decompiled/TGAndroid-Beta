package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class wu extends dq0 {
    public final jv X0;

    public wu(jv jvVar, Context context, String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, str, false, str2, false, c6Var);
        this.X0 = jvVar;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        AndroidUtilities.runOnUIThread(new rm(this, hVar, i10, 1), 100L);
    }
}
