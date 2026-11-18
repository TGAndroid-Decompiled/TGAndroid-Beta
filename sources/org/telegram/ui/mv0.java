package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
public final class mv0 extends org.telegram.ui.ActionBar.a5 {
    public final ProfileActivity f49978w0;

    public mv0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.f49978w0 = profileActivity;
    }

    @Override
    public final void H(int i7, float f10, float f11, te.c cVar) {
        super.H(i7, f10, f11, cVar);
        RectF rectF = ProfileActivity.Z6;
        this.f49978w0.A5();
    }
}
