package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class gz0 extends org.telegram.ui.Components.lq0 {
    public final ProfileActivity Y0;

    public gz0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.Y0 = profileActivity;
    }

    @Override
    public final void R0(a0.h hVar, int i10, TLRPC.TL_forumTopic tL_forumTopic, boolean z4) {
        if (!z4) {
            return;
        }
        AndroidUtilities.runOnUIThread(new zq0(this, hVar, i10, 26), 250L);
    }
}
