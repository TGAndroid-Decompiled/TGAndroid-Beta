package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class i20 implements nh.a {
    public final f40 f48522a;

    public i20(f40 f40Var) {
        this.f48522a = f40Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z10 = Q instanceof ProfileActivity;
        f40 f40Var = this.f48522a;
        if (z10 && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            f40Var.dismiss();
            return;
        }
        int S0 = f40Var.S0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        boolean z11 = true;
        if (groupCallMessage.fromId == org.telegram.messenger.j10.i(f40Var.f47454o1.f23218a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (S0 > 0 && S0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        Q.presentFragment(profileActivity, false, z11);
        f40Var.dismiss();
    }
}
