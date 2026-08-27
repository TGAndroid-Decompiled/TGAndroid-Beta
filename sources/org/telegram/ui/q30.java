package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;

public final class q30 implements ug.a {

    public final s50 f41506a;

    public q30(s50 s50Var) {
        this.f41506a = s50Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        boolean z10 = n2VarR instanceof ProfileActivity;
        s50 s50Var = this.f41506a;
        if (z10 && ((ProfileActivity) n2VarR).a() == groupCallMessage.fromId) {
            s50Var.dismiss();
            return;
        }
        int iP0 = s50Var.P0();
        Bundle bundle = new Bundle();
        long j10 = groupCallMessage.fromId;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        long j11 = groupCallMessage.fromId;
        boolean z11 = true;
        if (j11 == s50Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (iP0 > 0 && iP0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        n2VarR.presentFragment(profileActivity, false, z11);
        s50Var.dismiss();
    }
}
