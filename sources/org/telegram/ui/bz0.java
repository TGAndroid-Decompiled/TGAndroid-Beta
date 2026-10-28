package org.telegram.ui;

import android.content.Context;
public final class bz0 extends org.telegram.ui.Components.oi0 {
    public final ProfileActivity f38128s1;

    public bz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, ry0 ry0Var, az0 az0Var, org.telegram.ui.Components.ji0 ji0Var, org.telegram.ui.Components.fi0 fi0Var) {
        super(context, j10, kVar, ry0Var, az0Var, ji0Var, fi0Var);
        this.f38128s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f38128s1;
        profileActivity.f36111t5 = f7;
        profileActivity.J3();
    }
}
