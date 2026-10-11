package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class a91 extends org.telegram.ui.Components.or0 {
    public final h91 f35943b1;

    public a91(h91 h91Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.f35943b1 = h91Var;
    }

    @Override
    public final void S0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new m31(this, iVar, i10), 250L);
    }
}
