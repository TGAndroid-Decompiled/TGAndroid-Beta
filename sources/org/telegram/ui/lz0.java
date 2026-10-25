package org.telegram.ui;

import android.content.Context;
public final class lz0 extends org.telegram.ui.ActionBar.r5 {
    public final ProfileActivity m0;

    public lz0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.m0 = profileActivity;
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        super.E(i10, f7, f10, eVar);
        ProfileActivity.m1(this.m0);
    }
}
