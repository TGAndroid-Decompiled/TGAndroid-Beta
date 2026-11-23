package org.telegram.ui;

import android.content.Context;
public final class av0 extends org.telegram.ui.Components.hg0 {
    public final ProfileActivity f45711t1;

    public av0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, qu0 qu0Var, zu0 zu0Var, org.telegram.ui.Components.dg0 dg0Var, org.telegram.ui.Components.zf0 zf0Var) {
        super(context, j3, kVar, qu0Var, zu0Var, dg0Var, zf0Var);
        this.f45711t1 = profileActivity;
    }

    @Override
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.f45711t1;
        profileActivity.f43692t5 = f10;
        profileActivity.Q3();
    }
}
