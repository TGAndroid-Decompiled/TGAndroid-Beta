package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class d40 implements zg.a {
    public final d60 f35978a;

    public d40(d60 d60Var) {
        this.f35978a = d60Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z4 = R instanceof ProfileActivity;
        d60 d60Var = this.f35978a;
        if (z4 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            d60Var.dismiss();
            return;
        }
        int P0 = d60Var.P0();
        Bundle bundle = new Bundle();
        long j10 = groupCallMessage.fromId;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        long j11 = groupCallMessage.fromId;
        boolean z10 = true;
        if (j11 == d60Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (P0 > 0 && P0 != Integer.MAX_VALUE) {
            z10 = false;
        }
        R.presentFragment(profileActivity, false, z10);
        d60Var.dismiss();
    }
}
