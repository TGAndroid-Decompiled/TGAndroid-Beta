package org.telegram.ui;

import android.content.Context;
public final class ov0 extends org.telegram.ui.ActionBar.y4 {
    public final ProfileActivity f48527t0;

    public ov0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.f48527t0 = profileActivity;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        super.Y(i7, f10, f11, cVar);
        ProfileActivity.s1(this.f48527t0);
    }
}
