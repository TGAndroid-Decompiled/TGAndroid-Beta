package org.telegram.ui;

import android.content.Context;
public final class jw0 extends org.telegram.ui.Components.vg0 {
    public final ProfileActivity f38569s1;

    public jw0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.l lVar, aw0 aw0Var, iw0 iw0Var, org.telegram.ui.Components.rg0 rg0Var, org.telegram.ui.Components.ng0 ng0Var) {
        super(context, j10, lVar, aw0Var, iw0Var, rg0Var, ng0Var);
        this.f38569s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f38569s1;
        profileActivity.f33876n5 = f7;
        profileActivity.Q3();
    }
}
