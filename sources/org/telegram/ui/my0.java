package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class my0 extends org.telegram.ui.Components.er0 {
    public final ny0 f39366c1;

    public my0(ny0 ny0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f39366c1 = ny0Var;
    }

    @Override
    public final void T0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new jv0(this, hVar, i10, 15), 250L);
    }
}
