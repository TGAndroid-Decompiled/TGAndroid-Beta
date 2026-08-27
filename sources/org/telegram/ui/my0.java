package org.telegram.ui;

import android.content.Context;

public final class my0 extends org.telegram.ui.Components.ch0 {

    public final ProfileActivity f40613o1;

    public my0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, by0 by0Var, ly0 ly0Var, org.telegram.ui.Components.xg0 xg0Var, org.telegram.ui.Components.tg0 tg0Var) {
        super(context, j10, kVar, by0Var, ly0Var, xg0Var, tg0Var);
        this.f40613o1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f40613o1;
        profileActivity.f35992j5 = f10;
        profileActivity.B3();
    }
}
