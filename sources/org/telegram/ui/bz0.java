package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class bz0 extends org.telegram.ui.Components.vq0 {
    public final cz0 f32527b1;

    public bz0(cz0 cz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f32527b1 = cz0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new jx0(this, iVar, i10, 12), 250L);
    }
}
