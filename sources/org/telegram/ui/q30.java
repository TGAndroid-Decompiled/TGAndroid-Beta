package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class q30 implements wg.a {
    public final r50 f41523a;

    public q30(r50 r50Var) {
        this.f41523a = r50Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z10 = R instanceof ProfileActivity;
        r50 r50Var = this.f41523a;
        if (z10 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            r50Var.dismiss();
            return;
        }
        int P0 = r50Var.P0();
        Bundle bundle = new Bundle();
        long j10 = groupCallMessage.fromId;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        long j11 = groupCallMessage.fromId;
        boolean z11 = true;
        if (j11 == r50Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (P0 > 0 && P0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        R.presentFragment(profileActivity, false, z11);
        r50Var.dismiss();
    }
}
