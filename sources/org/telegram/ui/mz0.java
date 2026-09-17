package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class mz0 extends org.telegram.ui.Components.iq0 {
    public final nz0 f35909b1;

    public mz0(nz0 nz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f35909b1 = nz0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ky0(this, iVar, i10, 7), 250L);
    }
}
