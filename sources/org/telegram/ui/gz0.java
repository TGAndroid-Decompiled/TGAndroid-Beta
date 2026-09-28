package org.telegram.ui;

import android.content.Context;
public final class gz0 extends org.telegram.ui.Components.bi0 {
    public final ProfileActivity f34083s1;

    public gz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, wy0 wy0Var, fz0 fz0Var, org.telegram.ui.Components.wh0 wh0Var, org.telegram.ui.Components.sh0 sh0Var) {
        super(context, j3, kVar, wy0Var, fz0Var, wh0Var, sh0Var);
        this.f34083s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f34083s1;
        profileActivity.f31621n5 = f7;
        profileActivity.B3();
    }
}
