package org.telegram.ui;

import android.content.Context;
public final class cv0 extends org.telegram.ui.Components.tf0 {
    public final ProfileActivity f44765s1;

    public cv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, su0 su0Var, bv0 bv0Var, org.telegram.ui.Components.pf0 pf0Var, org.telegram.ui.Components.lf0 lf0Var) {
        super(context, j3, kVar, su0Var, bv0Var, pf0Var, lf0Var);
        this.f44765s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f44765s1;
        profileActivity.f41808p5 = f10;
        profileActivity.Q3();
    }
}
