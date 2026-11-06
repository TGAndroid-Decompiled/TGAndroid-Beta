package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class kv0 extends org.telegram.ui.Components.mo0 {
    public final ProfileActivity R2;

    public kv0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.R2 = profileActivity;
    }

    @Override
    public final void R0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z9) {
        if (!z9) {
            return;
        }
        org.telegram.messenger.g0.i3(new qn0(this, hVar, i7, 24), 250L);
    }
}
