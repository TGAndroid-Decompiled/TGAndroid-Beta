package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class i20 implements nh.a {
    public final e40 f46446a;

    public i20(e40 e40Var) {
        this.f46446a = e40Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z9 = Q instanceof ProfileActivity;
        e40 e40Var = this.f46446a;
        if (z9 && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            e40Var.dismiss();
            return;
        }
        int R0 = e40Var.R0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        boolean z10 = true;
        if (groupCallMessage.fromId == org.telegram.messenger.p10.i(e40Var.f45228k1.f21765a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (R0 > 0 && R0 != Integer.MAX_VALUE) {
            z10 = false;
        }
        Q.presentFragment(profileActivity, false, z10);
        e40Var.dismiss();
    }
}
