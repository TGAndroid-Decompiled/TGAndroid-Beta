package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class c40 implements lh.a {
    public final d60 f32558a;

    public c40(d60 d60Var) {
        this.f32558a = d60Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z10 = R instanceof ProfileActivity;
        d60 d60Var = this.f32558a;
        if (z10 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            d60Var.dismiss();
            return;
        }
        int P0 = d60Var.P0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        long j10 = groupCallMessage.fromId;
        boolean z11 = true;
        if (j10 == d60Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (P0 > 0 && P0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        R.presentFragment(profileActivity, false, z11);
        d60Var.dismiss();
    }
}
