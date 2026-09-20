package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class kz0 extends org.telegram.ui.Components.uq0 {
    public final lz0 f35266b1;

    public kz0(lz0 lz0Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f35266b1 = lz0Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new rx0(this, iVar, i10, 13), 250L);
    }
}
