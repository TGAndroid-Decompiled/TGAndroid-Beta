package org.telegram.ui;

import android.content.Context;
public final class dz0 extends org.telegram.ui.Components.wh0 {
    public final ProfileActivity f33567p1;

    public dz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, ty0 ty0Var, cz0 cz0Var, org.telegram.ui.Components.rh0 rh0Var, org.telegram.ui.Components.nh0 nh0Var) {
        super(context, j10, kVar, ty0Var, cz0Var, rh0Var, nh0Var);
        this.f33567p1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f33567p1;
        profileActivity.f32078k5 = f10;
        profileActivity.B3();
    }
}
