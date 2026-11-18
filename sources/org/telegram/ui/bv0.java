package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
public final class bv0 extends org.telegram.ui.Components.e5 {
    public final ProfileActivity V0;

    public bv0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.V0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        RectF rectF = ProfileActivity.Z6;
        this.V0.Q3();
    }

    @Override
    public final void setTextColor(int i7) {
        int r12;
        ProfileActivity profileActivity = this.V0;
        profileActivity.K5 = i7;
        int f10 = i0.a.f(profileActivity.G5, i7, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29788y6, profileActivity.A0));
        super.setTextColor(f10);
        xw0 xw0Var = profileActivity.F6;
        if (xw0Var != null && xw0Var.f53959c != (r12 = org.telegram.ui.ActionBar.n6.r1(1.4f, org.telegram.ui.ActionBar.n6.b(-0.02f, 0.15f, f10)))) {
            xw0Var.f53959c = r12;
            xw0Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.V0;
        profileActivity.r4();
        profileActivity.getClass();
        org.telegram.ui.Components.uu0 uu0Var = profileActivity.T;
        if (uu0Var != null) {
            uu0Var.setTranslationX(f10 - profileActivity.r4());
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.V0;
        if (profileActivity.T != null) {
            org.telegram.messenger.g0.L(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        org.telegram.ui.Components.uu0 uu0Var = profileActivity.T;
        if (uu0Var != null) {
            uu0Var.setTranslationY(f10 - org.telegram.messenger.g0.L(5.0f));
        }
    }
}
