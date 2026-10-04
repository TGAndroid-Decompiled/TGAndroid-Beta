package org.telegram.ui;

import android.content.Context;
public final class jz0 extends org.telegram.ui.Components.bi0 {
    public final ProfileActivity f37788s1;

    public jz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, yy0 yy0Var, iz0 iz0Var, org.telegram.ui.Components.wh0 wh0Var, org.telegram.ui.Components.sh0 sh0Var) {
        super(context, j3, kVar, yy0Var, iz0Var, wh0Var, sh0Var);
        this.f37788s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f37788s1;
        profileActivity.f34298n5 = f7;
        profileActivity.B3();
    }
}
