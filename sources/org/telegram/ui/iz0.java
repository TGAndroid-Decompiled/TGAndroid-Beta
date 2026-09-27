package org.telegram.ui;

import android.content.Context;
public final class iz0 extends org.telegram.ui.Components.bi0 {
    public final ProfileActivity f34550s1;

    public iz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.l lVar, yy0 yy0Var, hz0 hz0Var, org.telegram.ui.Components.wh0 wh0Var, org.telegram.ui.Components.sh0 sh0Var) {
        super(context, j3, lVar, yy0Var, hz0Var, wh0Var, sh0Var);
        this.f34550s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f34550s1;
        profileActivity.f31622n5 = f7;
        profileActivity.B3();
    }
}
