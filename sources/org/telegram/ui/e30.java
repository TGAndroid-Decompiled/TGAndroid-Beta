package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class e30 implements dh.b {
    public final a50 f36724a;

    public e30(a50 a50Var) {
        this.f36724a = a50Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z10 = Q instanceof ProfileActivity;
        a50 a50Var = this.f36724a;
        if (z10 && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            a50Var.dismiss();
            return;
        }
        int R0 = a50Var.R0();
        Bundle bundle = new Bundle();
        long j10 = groupCallMessage.fromId;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        boolean z11 = true;
        if (groupCallMessage.fromId == org.telegram.messenger.e20.i(a50Var.f35620k1.f15043a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (R0 > 0 && R0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        Q.presentFragment(profileActivity, false, z11);
        a50Var.dismiss();
    }
}
