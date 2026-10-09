package org.telegram.ui;

import android.content.Context;
public final class pz0 extends org.telegram.ui.Components.ti0 {
    public final ProfileActivity f40935s1;

    public pz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, ez0 ez0Var, oz0 oz0Var, org.telegram.ui.Components.oi0 oi0Var, org.telegram.ui.Components.ki0 ki0Var) {
        super(context, j3, kVar, ez0Var, oz0Var, oi0Var, ki0Var);
        this.f40935s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f40935s1;
        profileActivity.f34308n5 = f7;
        profileActivity.B3();
    }
}
