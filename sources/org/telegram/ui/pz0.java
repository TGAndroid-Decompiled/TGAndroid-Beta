package org.telegram.ui;

import android.content.Context;
public final class pz0 extends org.telegram.ui.Components.zh0 {
    public final ProfileActivity f36646s1;

    public pz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, fz0 fz0Var, oz0 oz0Var, org.telegram.ui.Components.uh0 uh0Var, org.telegram.ui.Components.qh0 qh0Var) {
        super(context, j3, kVar, fz0Var, oz0Var, uh0Var, qh0Var);
        this.f36646s1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.f36646s1;
        profileActivity.f31578n5 = f7;
        profileActivity.B3();
    }
}
