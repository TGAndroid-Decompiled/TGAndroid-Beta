package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class q71 extends org.telegram.ui.Components.sp0 {
    public final x71 X0;

    public q71(x71 x71Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = x71Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (z10) {
            AndroidUtilities.runOnUIThread(new m21(this, hVar, i10), 250L);
        }
    }
}
