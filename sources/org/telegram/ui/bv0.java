package org.telegram.ui;

import android.content.Context;
public final class bv0 extends org.telegram.ui.Components.hg0 {
    public final ProfileActivity f46309t1;

    public bv0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, ru0 ru0Var, av0 av0Var, org.telegram.ui.Components.dg0 dg0Var, org.telegram.ui.Components.zf0 zf0Var) {
        super(context, j3, kVar, ru0Var, av0Var, dg0Var, zf0Var);
        this.f46309t1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f46309t1;
        profileActivity.f43657t5 = f10;
        profileActivity.Q3();
    }
}
