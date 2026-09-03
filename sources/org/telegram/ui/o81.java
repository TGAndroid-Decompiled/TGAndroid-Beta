package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class o81 extends org.telegram.ui.Components.lq0 {
    public final v81 Y0;

    public o81(v81 v81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.Y0 = v81Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new h21(this, hVar, i10), 250L);
    }
}
