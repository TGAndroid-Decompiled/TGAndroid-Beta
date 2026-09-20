package org.telegram.ui;

import android.content.Context;
public final class pz0 extends org.telegram.ui.Components.yh0 {
    public final ProfileActivity f36726s1;

    public pz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, fz0 fz0Var, oz0 oz0Var, org.telegram.ui.Components.th0 th0Var, org.telegram.ui.Components.ph0 ph0Var) {
        super(context, j3, kVar, fz0Var, oz0Var, th0Var, ph0Var);
        this.f36726s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f36726s1;
        profileActivity.f31618n5 = f7;
        profileActivity.B3();
    }
}
