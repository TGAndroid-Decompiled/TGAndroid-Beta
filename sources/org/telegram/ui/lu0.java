package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class lu0 extends org.telegram.ui.Components.oo0 {
    public final mu0 S2;

    public lu0(mu0 mu0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.S2 = mu0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.i3(new hk0(this, hVar, i3, 28), 250L);
    }
}
