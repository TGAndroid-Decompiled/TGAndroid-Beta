package org.telegram.ui;

import android.content.Context;
public final class my0 extends org.telegram.ui.Components.ah0 {
    public final ProfileActivity f40557o1;

    public my0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, by0 by0Var, ly0 ly0Var, org.telegram.ui.Components.vg0 vg0Var, org.telegram.ui.Components.rg0 rg0Var) {
        super(context, j10, kVar, by0Var, ly0Var, vg0Var, rg0Var);
        this.f40557o1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f40557o1;
        profileActivity.f35989j5 = f10;
        profileActivity.B3();
    }
}
