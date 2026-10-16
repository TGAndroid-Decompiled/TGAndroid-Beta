package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class pz0 extends org.telegram.ui.Components.ir0 {
    public final qz0 f39036b1;

    public pz0(qz0 qz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f39036b1 = qz0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new rr0(this, hVar, i10, 27), 250L);
    }
}
