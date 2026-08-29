package org.telegram.ui;

import android.content.Context;
public final class my0 extends org.telegram.ui.Components.kh0 {
    public final ProfileActivity f40652o1;

    public my0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.l lVar, by0 by0Var, ly0 ly0Var, org.telegram.ui.Components.fh0 fh0Var, org.telegram.ui.Components.bh0 bh0Var) {
        super(context, j10, lVar, by0Var, ly0Var, fh0Var, bh0Var);
        this.f40652o1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f9) {
        ProfileActivity profileActivity = this.f40652o1;
        profileActivity.f36054j5 = f9;
        profileActivity.B3();
    }
}
