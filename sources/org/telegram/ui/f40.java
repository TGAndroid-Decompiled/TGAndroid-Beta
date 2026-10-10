package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class f40 implements lh.a {
    public final g60 f37485a;

    public f40(g60 g60Var) {
        this.f37485a = g60Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z10 = R instanceof ProfileActivity;
        g60 g60Var = this.f37485a;
        if (z10 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            g60Var.dismiss();
            return;
        }
        int Q0 = g60Var.Q0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        boolean z11 = true;
        if (groupCallMessage.fromId == g60Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (Q0 > 0 && Q0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        R.presentFragment(profileActivity, false, z11);
        g60Var.dismiss();
    }
}
