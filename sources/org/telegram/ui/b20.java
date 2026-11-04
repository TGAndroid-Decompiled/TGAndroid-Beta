package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class b20 implements oh.a {
    public final x30 f43901a;

    public b20(x30 x30Var) {
        this.f43901a = x30Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z10 = Q instanceof ProfileActivity;
        x30 x30Var = this.f43901a;
        if (z10 && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            x30Var.dismiss();
            return;
        }
        int R0 = x30Var.R0();
        Bundle bundle = new Bundle();
        long j10 = groupCallMessage.fromId;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        boolean z11 = true;
        if (groupCallMessage.fromId == org.telegram.messenger.h10.i(x30Var.f51759l1.f21919a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (R0 > 0 && R0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        Q.presentFragment(profileActivity, false, z11);
        x30Var.dismiss();
    }
}
