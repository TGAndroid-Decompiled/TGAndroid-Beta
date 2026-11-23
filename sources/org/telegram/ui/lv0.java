package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
public final class lv0 extends org.telegram.ui.ActionBar.z4 {
    public final ProfileActivity f49848w0;

    public lv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f49848w0 = profileActivity;
    }

    @Override
    public final void K(int i7, float f10, float f11, te.c cVar) {
        super.K(i7, f10, f11, cVar);
        RectF rectF = ProfileActivity.Z6;
        this.f49848w0.A5();
    }
}
