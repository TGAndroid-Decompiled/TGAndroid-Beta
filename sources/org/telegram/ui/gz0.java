package org.telegram.ui;

import android.content.Context;
public final class gz0 extends org.telegram.ui.Components.zh0 {
    public final ProfileActivity f34083s1;

    public gz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, wy0 wy0Var, fz0 fz0Var, org.telegram.ui.Components.uh0 uh0Var, org.telegram.ui.Components.qh0 qh0Var) {
        super(context, j3, kVar, wy0Var, fz0Var, uh0Var, qh0Var);
        this.f34083s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f34083s1;
        profileActivity.f31621n5 = f7;
        profileActivity.B3();
    }
}
