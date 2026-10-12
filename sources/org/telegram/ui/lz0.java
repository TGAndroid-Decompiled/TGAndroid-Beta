package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class lz0 extends org.telegram.ui.Components.sr0 {
    public final mz0 f39873b1;

    public lz0(mz0 mz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f39873b1 = mz0Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new du0(this, iVar, i10, 19), 250L);
    }
}
