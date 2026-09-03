package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class at0 extends lq0 {
    public final org.telegram.ui.ActionBar.p2 Y0;

    public at0(Context context, String str, String str2, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context, null, str, false, str2, false, g6Var);
        this.Y0 = p2Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        AndroidUtilities.runOnUIThread(new gy(this.Y0, hVar, i10, 12), 100L);
    }
}
