package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class h20 implements nh.a {
    public final e40 f48414a;

    public h20(e40 e40Var) {
        this.f48414a = e40Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z10 = Q instanceof ProfileActivity;
        e40 e40Var = this.f48414a;
        if (z10 && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            e40Var.dismiss();
            return;
        }
        int S0 = e40Var.S0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        boolean z11 = true;
        if (groupCallMessage.fromId == org.telegram.messenger.i10.i(e40Var.f47376o1.f23343a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (S0 > 0 && S0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        Q.presentFragment(profileActivity, false, z11);
        e40Var.dismiss();
    }
}
