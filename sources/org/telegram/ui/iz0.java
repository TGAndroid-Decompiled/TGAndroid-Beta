package org.telegram.ui;

import android.content.Context;
public final class iz0 extends org.telegram.ui.Components.ph0 {
    public final ProfileActivity f34290s1;

    public iz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, yy0 yy0Var, hz0 hz0Var, org.telegram.ui.Components.kh0 kh0Var, org.telegram.ui.Components.gh0 gh0Var) {
        super(context, j3, kVar, yy0Var, hz0Var, kh0Var, gh0Var);
        this.f34290s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f34290s1;
        profileActivity.f31305n5 = f7;
        profileActivity.B3();
    }
}
