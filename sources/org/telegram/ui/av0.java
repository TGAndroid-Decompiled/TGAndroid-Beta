package org.telegram.ui;

import android.content.Context;
public final class av0 extends org.telegram.ui.Components.sf0 {
    public final ProfileActivity f44103s1;

    public av0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, qu0 qu0Var, zu0 zu0Var, org.telegram.ui.Components.of0 of0Var, org.telegram.ui.Components.kf0 kf0Var) {
        super(context, j3, kVar, qu0Var, zu0Var, of0Var, kf0Var);
        this.f44103s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f44103s1;
        profileActivity.f41785n5 = f10;
        profileActivity.Q3();
    }
}
