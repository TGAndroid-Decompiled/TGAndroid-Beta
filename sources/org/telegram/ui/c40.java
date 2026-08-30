package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class c40 implements yg.a {
    public final c60 f33090a;

    public c40(c60 c60Var) {
        this.f33090a = c60Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z4 = R instanceof ProfileActivity;
        c60 c60Var = this.f33090a;
        if (z4 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            c60Var.dismiss();
            return;
        }
        int P0 = c60Var.P0();
        Bundle bundle = new Bundle();
        long j10 = groupCallMessage.fromId;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        long j11 = groupCallMessage.fromId;
        boolean z10 = true;
        if (j11 == c60Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (P0 > 0 && P0 != Integer.MAX_VALUE) {
            z10 = false;
        }
        R.presentFragment(profileActivity, false, z10);
        c60Var.dismiss();
    }
}
