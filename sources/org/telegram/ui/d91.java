package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class d91 extends org.telegram.ui.Components.sq0 {
    public final k91 f31867b1;

    public d91(k91 k91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f31867b1 = k91Var;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ey0(this, iVar, i10, 29), 250L);
    }
}
