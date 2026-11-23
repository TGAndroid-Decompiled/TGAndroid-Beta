package org.telegram.ui;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class jv0 extends org.telegram.ui.Components.zo0 {
    public final ProfileActivity V2;

    public jv0(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.V2 = profileActivity;
    }

    @Override
    public final void S0(a0.h hVar, int i7, TLRPC.TL_forumTopic tL_forumTopic, boolean z10) {
        if (!z10) {
            return;
        }
        org.telegram.messenger.g0.h3(new mp0(this, hVar, i7, 22), 250L);
    }
}
