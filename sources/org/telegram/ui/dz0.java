package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class dz0 extends org.telegram.ui.Components.hq0 {
    public final ez0 f32752b1;

    public dz0(ez0 ez0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f32752b1 = ez0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new by0(this, iVar, i10, 7), 250L);
    }
}
