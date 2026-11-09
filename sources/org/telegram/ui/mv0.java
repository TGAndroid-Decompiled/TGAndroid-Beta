package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class mv0 extends org.telegram.ui.Components.no0 {
    public final ProfileActivity R2;

    public mv0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = profileActivity;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new sn0(this, hVar, i7, 25), 250L);
    }
}
