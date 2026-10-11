package org.telegram.ui;

import android.content.Context;
public final class oz0 extends org.telegram.ui.Components.ui0 {
    public final ProfileActivity f40701s1;

    public oz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, dz0 dz0Var, nz0 nz0Var, org.telegram.ui.Components.pi0 pi0Var, org.telegram.ui.Components.li0 li0Var) {
        super(context, j3, kVar, dz0Var, nz0Var, pi0Var, li0Var);
        this.f40701s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f40701s1;
        profileActivity.f34370n5 = f7;
        profileActivity.B3();
    }
}
