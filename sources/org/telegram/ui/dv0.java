package org.telegram.ui;

import android.content.Context;
public final class dv0 extends org.telegram.ui.ActionBar.y4 {
    public final ProfileActivity f44817t0;

    public dv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f44817t0 = profileActivity;
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        super.Y(i3, f10, f11, cVar);
        ProfileActivity.s1(this.f44817t0);
    }
}
