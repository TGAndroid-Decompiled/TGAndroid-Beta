package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class c01 extends org.telegram.ui.Components.sq0 {
    public final ProfileActivity f31479b1;

    public c01(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f31479b1 = profileActivity;
    }

    @Override
    public final void R0(a0.i iVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ey0(this, iVar, i10, 11), 250L);
    }
}
