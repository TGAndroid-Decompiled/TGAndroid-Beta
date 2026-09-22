package org.telegram.ui;

import android.content.Context;
public final class pz0 extends org.telegram.ui.Components.bi0 {
    public final ProfileActivity f36749s1;

    public pz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, fz0 fz0Var, oz0 oz0Var, org.telegram.ui.Components.wh0 wh0Var, org.telegram.ui.Components.sh0 sh0Var) {
        super(context, j3, kVar, fz0Var, oz0Var, wh0Var, sh0Var);
        this.f36749s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f36749s1;
        profileActivity.f31639n5 = f7;
        profileActivity.B3();
    }
}
