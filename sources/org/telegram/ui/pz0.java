package org.telegram.ui;

import android.content.Context;
public final class pz0 extends org.telegram.ui.Components.oh0 {
    public final ProfileActivity f36720s1;

    public pz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, fz0 fz0Var, oz0 oz0Var, org.telegram.ui.Components.jh0 jh0Var, org.telegram.ui.Components.fh0 fh0Var) {
        super(context, j3, kVar, fz0Var, oz0Var, jh0Var, fh0Var);
        this.f36720s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f36720s1;
        profileActivity.f31334n5 = f7;
        profileActivity.B3();
    }
}
