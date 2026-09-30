package org.telegram.ui;

import android.content.Context;
public final class gz0 extends org.telegram.ui.Components.ci0 {
    public final ProfileActivity f34175s1;

    public gz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, wy0 wy0Var, fz0 fz0Var, org.telegram.ui.Components.xh0 xh0Var, org.telegram.ui.Components.th0 th0Var) {
        super(context, j3, kVar, wy0Var, fz0Var, xh0Var, th0Var);
        this.f34175s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f34175s1;
        profileActivity.f31694n5 = f7;
        profileActivity.B3();
    }
}
