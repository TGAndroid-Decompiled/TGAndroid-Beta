package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class p81 extends org.telegram.ui.Components.lq0 {
    public final w81 Y0;

    public p81(w81 w81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.Y0 = w81Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new b11(this, hVar, i10), 250L);
    }
}
