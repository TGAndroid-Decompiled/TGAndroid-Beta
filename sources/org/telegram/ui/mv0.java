package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
public final class mv0 extends org.telegram.ui.ActionBar.z4 {
    public final ProfileActivity f49993w0;

    public mv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.f49993w0 = profileActivity;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        super.H(i7, f10, f11, cVar);
        RectF rectF = ProfileActivity.Z6;
        this.f49993w0.A5();
    }
}
