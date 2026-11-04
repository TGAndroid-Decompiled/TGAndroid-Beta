package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class bv0 extends org.telegram.ui.Components.oo0 {
    public final ProfileActivity S2;

    public bv0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.S2 = profileActivity;
    }

    @Override
    public final void R0(a0.h hVar, int i3, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.i3(new hk0(this, hVar, i3, 29), 250L);
    }
}
