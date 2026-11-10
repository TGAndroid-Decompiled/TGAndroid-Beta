package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class j20 implements nh.a {
    public final f40 f46795a;

    public j20(f40 f40Var) {
        this.f46795a = f40Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z9 = Q instanceof ProfileActivity;
        f40 f40Var = this.f46795a;
        if (z9 && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            f40Var.dismiss();
            return;
        }
        int R0 = f40Var.R0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        boolean z10 = true;
        if (groupCallMessage.fromId == org.telegram.messenger.p10.i(f40Var.n1.f21770a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (R0 > 0 && R0 != Integer.MAX_VALUE) {
            z10 = false;
        }
        Q.presentFragment(profileActivity, false, z10);
        f40Var.dismiss();
    }
}
