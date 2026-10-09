package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class jz0 extends org.telegram.ui.Components.mr0 {
    public final kz0 f39046b1;

    public jz0(kz0 kz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f39046b1 = kz0Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new rt0(this, iVar, i10, 21), 250L);
    }
}
