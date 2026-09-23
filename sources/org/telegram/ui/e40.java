package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class e40 implements lh.a {
    public final f60 f32793a;

    public e40(f60 f60Var) {
        this.f32793a = f60Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == null) {
            return;
        }
        boolean z10 = R instanceof ProfileActivity;
        f60 f60Var = this.f32793a;
        if (z10 && ((ProfileActivity) R).a() == groupCallMessage.fromId) {
            f60Var.dismiss();
            return;
        }
        int P0 = f60Var.P0();
        Bundle bundle = new Bundle();
        long j3 = groupCallMessage.fromId;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        long j10 = groupCallMessage.fromId;
        boolean z11 = true;
        if (j10 == f60Var.d.getUserConfig().getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (P0 > 0 && P0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        R.presentFragment(profileActivity, false, z11);
        f60Var.dismiss();
    }
}
