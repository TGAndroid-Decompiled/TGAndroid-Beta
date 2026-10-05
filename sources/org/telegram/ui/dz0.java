package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class dz0 extends org.telegram.ui.Components.br0 {
    public final ez0 X0;

    public dz0(ez0 ez0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.X0 = ez0Var;
    }

    @Override
    public final void O0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new wx0(this, iVar, i10, 10), 250L);
    }
}
