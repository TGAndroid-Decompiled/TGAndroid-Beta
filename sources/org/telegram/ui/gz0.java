package org.telegram.ui;

import android.content.Context;
public final class gz0 extends org.telegram.ui.Components.ai0 {
    public final ProfileActivity f34081s1;

    public gz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, wy0 wy0Var, fz0 fz0Var, org.telegram.ui.Components.vh0 vh0Var, org.telegram.ui.Components.rh0 rh0Var) {
        super(context, j3, kVar, wy0Var, fz0Var, vh0Var, rh0Var);
        this.f34081s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f34081s1;
        profileActivity.f31619n5 = f7;
        profileActivity.B3();
    }
}
