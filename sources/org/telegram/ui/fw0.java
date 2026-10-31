package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class fw0 extends org.telegram.ui.Components.op0 {
    public final gw0 R2;

    public fw0(gw0 gw0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.R2 = gw0Var;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.i0.h3(new et0(this, hVar, i10, 16), 250L);
    }
}
