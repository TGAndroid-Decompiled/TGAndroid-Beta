package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gy0 extends org.telegram.ui.Components.dq0 {
    public final hy0 X0;

    public gy0(hy0 hy0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = hy0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new av0(this, hVar, i10, 16), 250L);
    }
}
