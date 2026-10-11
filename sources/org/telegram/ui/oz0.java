package org.telegram.ui;

import android.content.Context;
public final class oz0 extends org.telegram.ui.Components.vi0 {
    public final ProfileActivity f40667s1;

    public oz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, dz0 dz0Var, nz0 nz0Var, org.telegram.ui.Components.qi0 qi0Var, org.telegram.ui.Components.mi0 mi0Var) {
        super(context, j3, kVar, dz0Var, nz0Var, qi0Var, mi0Var);
        this.f40667s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f40667s1;
        profileActivity.f34336n5 = f7;
        profileActivity.B3();
    }
}
