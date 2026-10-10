package org.telegram.ui;

import android.content.Context;
public final class pz0 extends org.telegram.ui.Components.ui0 {
    public final ProfileActivity f40981s1;

    public pz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, ez0 ez0Var, oz0 oz0Var, org.telegram.ui.Components.pi0 pi0Var, org.telegram.ui.Components.li0 li0Var) {
        super(context, j3, kVar, ez0Var, oz0Var, pi0Var, li0Var);
        this.f40981s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f40981s1;
        profileActivity.f34346n5 = f7;
        profileActivity.B3();
    }
}
