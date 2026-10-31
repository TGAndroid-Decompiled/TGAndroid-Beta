package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
public final class f30 implements dh.b {
    public final b50 f37165a;

    public f30(b50 b50Var) {
        this.f37165a = b50Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z10 = Q instanceof ProfileActivity;
        b50 b50Var = this.f37165a;
        if (z10 && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            b50Var.dismiss();
            return;
        }
        int R0 = b50Var.R0();
        Bundle bundle = new Bundle();
        long j10 = groupCallMessage.fromId;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        boolean z11 = true;
        if (groupCallMessage.fromId == org.telegram.messenger.d20.i(b50Var.f36036k1.f14863a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (R0 > 0 && R0 != Integer.MAX_VALUE) {
            z11 = false;
        }
        Q.presentFragment(profileActivity, false, z11);
        b50Var.dismiss();
    }
}
