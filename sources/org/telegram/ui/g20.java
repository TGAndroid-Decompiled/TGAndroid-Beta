package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class g20 implements nh.a {
    public final c40 f45764a;

    public g20(c40 c40Var) {
        this.f45764a = c40Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z9 = Q instanceof ProfileActivity;
        c40 c40Var = this.f45764a;
        if (z9 && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            c40Var.dismiss();
            return;
        }
        int R0 = c40Var.R0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        boolean z10 = true;
        if (groupCallMessage.fromId == org.telegram.messenger.p10.i(c40Var.f44565k1.f21723a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (R0 > 0 && R0 != Integer.MAX_VALUE) {
            z10 = false;
        }
        Q.presentFragment(profileActivity, false, z10);
        c40Var.dismiss();
    }
}
