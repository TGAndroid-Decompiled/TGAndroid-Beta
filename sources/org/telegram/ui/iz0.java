package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class iz0 extends org.telegram.ui.Components.or0 {
    public final jz0 f38803b1;

    public iz0(jz0 jz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f38803b1 = jz0Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new tt0(this, iVar, i10, 20), 250L);
    }
}
