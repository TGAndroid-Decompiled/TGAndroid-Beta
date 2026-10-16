package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class h91 extends org.telegram.ui.Components.ir0 {
    public final o91 f36456b1;

    public h91(o91 o91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f36456b1 = o91Var;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new i11(this, hVar, i10), 250L);
    }
}
