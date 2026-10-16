package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class e01 extends org.telegram.ui.Components.ir0 {
    public final ProfileActivity f35166b1;

    public e01(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f35166b1 = profileActivity;
    }

    @Override
    public final void S0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new rr0(this, hVar, i10, 28), 250L);
    }
}
