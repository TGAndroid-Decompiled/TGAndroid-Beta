package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class oy0 extends org.telegram.ui.Components.dr0 {
    public final py0 f39922b1;

    public oy0(py0 py0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f39922b1 = py0Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new lv0(this, hVar, i10, 15), 250L);
    }
}
