package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class i40 implements kh.a {
    public final j60 f33532a;

    public i40(j60 j60Var) {
        this.f33532a = j60Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z10 = R instanceof ProfileActivity;
        j60 j60Var = this.f33532a;
        if (z10 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            j60Var.dismiss();
            return;
        }
        int P0 = j60Var.P0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        long j10 = groupCallMessage.fromId;
        boolean z11 = true;
        if (j10 == j60Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (P0 > 0 && P0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        R.presentFragment(profileActivity, false, z11);
        j60Var.dismiss();
    }
}
