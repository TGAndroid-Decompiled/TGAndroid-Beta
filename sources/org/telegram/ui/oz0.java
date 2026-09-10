package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class oz0 extends org.telegram.ui.Components.sq0 {
    public final pz0 f35650b1;

    public oz0(pz0 pz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f35650b1 = pz0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ey0(this, iVar, i10, 10), 250L);
    }
}
