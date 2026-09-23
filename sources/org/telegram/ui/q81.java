package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class q81 extends org.telegram.ui.Components.hq0 {
    public final x81 f36321b1;

    public q81(x81 x81Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f36321b1 = x81Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new by0(this, iVar, i10, 26), 250L);
    }
}
