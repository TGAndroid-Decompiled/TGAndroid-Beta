package org.telegram.ui;

import android.content.Context;
public final class lv0 extends org.telegram.ui.ActionBar.y4 {
    public final ProfileActivity f47569s0;

    public lv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f47569s0 = profileActivity;
    }

    @Override
    public final void Y(int i7, float f10, float f11, te.c cVar) {
        super.Y(i7, f10, f11, cVar);
        ProfileActivity.s1(this.f47569s0);
    }
}
