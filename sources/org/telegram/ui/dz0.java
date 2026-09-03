package org.telegram.ui;

import android.content.Context;
public final class dz0 extends org.telegram.ui.Components.xh0 {
    public final ProfileActivity f36289p1;

    public dz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, ty0 ty0Var, cz0 cz0Var, org.telegram.ui.Components.sh0 sh0Var, org.telegram.ui.Components.oh0 oh0Var) {
        super(context, j10, kVar, ty0Var, cz0Var, sh0Var, oh0Var);
        this.f36289p1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f36289p1;
        profileActivity.f34637k5 = f10;
        profileActivity.B3();
    }
}
