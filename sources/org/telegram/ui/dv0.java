package org.telegram.ui;

import android.content.Context;
public final class dv0 extends org.telegram.ui.Components.sf0 {
    public final ProfileActivity f45063s1;

    public dv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.l lVar, tu0 tu0Var, cv0 cv0Var, org.telegram.ui.Components.of0 of0Var, org.telegram.ui.Components.kf0 kf0Var) {
        super(context, j3, lVar, tu0Var, cv0Var, of0Var, kf0Var);
        this.f45063s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f45063s1;
        profileActivity.f41799p5 = f10;
        profileActivity.Q3();
    }
}
