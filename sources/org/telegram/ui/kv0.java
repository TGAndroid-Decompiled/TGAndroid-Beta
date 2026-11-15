package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
public final class kv0 extends org.telegram.ui.ActionBar.w4 {
    public final ProfileActivity f48779u0;

    public kv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f48779u0 = profileActivity;
    }

    @Override
    public final void G(int i7, float f10, float f11, te.c cVar) {
        super.G(i7, f10, f11, cVar);
        RectF rectF = ProfileActivity.X6;
        this.f48779u0.z5();
    }
}
