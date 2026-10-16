package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class l40 implements mh.a {
    public final n60 f37602a;

    public l40(n60 n60Var) {
        this.f37602a = n60Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z10 = R instanceof ProfileActivity;
        n60 n60Var = this.f37602a;
        if (z10 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            n60Var.dismiss();
            return;
        }
        int Q0 = n60Var.Q0();
        Bundle bundle = new Bundle();
        long j10 = groupCallMessage.fromId;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        boolean z11 = true;
        if (groupCallMessage.fromId == n60Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (Q0 > 0 && Q0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        R.presentFragment(profileActivity, false, z11);
        n60Var.dismiss();
    }
}
