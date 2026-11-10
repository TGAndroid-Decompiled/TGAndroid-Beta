package org.telegram.ui;

import android.content.Context;
public final class pv0 extends org.telegram.ui.ActionBar.z4 {
    public final ProfileActivity f48843t0;

    public pv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f48843t0 = profileActivity;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        super.Y(i7, f10, f11, cVar);
        ProfileActivity.s1(this.f48843t0);
    }
}
