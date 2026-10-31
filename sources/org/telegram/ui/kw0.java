package org.telegram.ui;

import android.content.Context;
public final class kw0 extends org.telegram.ui.Components.ug0 {
    public final ProfileActivity f38963s1;

    public kw0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.l lVar, bw0 bw0Var, jw0 jw0Var, org.telegram.ui.Components.qg0 qg0Var, org.telegram.ui.Components.mg0 mg0Var) {
        super(context, j10, lVar, bw0Var, jw0Var, qg0Var, mg0Var);
        this.f38963s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f38963s1;
        profileActivity.f33869n5 = f7;
        profileActivity.P3();
    }
}
