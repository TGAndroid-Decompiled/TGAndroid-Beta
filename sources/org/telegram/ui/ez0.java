package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ez0 extends org.telegram.ui.Components.hr0 {
    public final ProfileActivity f37151e1;

    public ez0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.f37151e1 = profileActivity;
    }

    @Override
    public final void W0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        AndroidUtilities.runOnUIThread(new lv0(this, hVar, i10, 16), 250L);
    }
}
