package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
public final class dv0 extends org.telegram.ui.Components.y4 {
    public final ProfileActivity U0;

    public dv0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.U0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        RectF rectF = ProfileActivity.V6;
        this.U0.Q3();
    }

    @Override
    public final void setTextColor(int i7) {
        int r12;
        ProfileActivity profileActivity = this.U0;
        profileActivity.G5 = i7;
        int f10 = i0.a.f(profileActivity.C5, i7, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28257y6, profileActivity.f41876z0));
        super.setTextColor(f10);
        xw0 xw0Var = profileActivity.B6;
        if (xw0Var != null && xw0Var.f51785c != (r12 = org.telegram.ui.ActionBar.l6.r1(1.4f, org.telegram.ui.ActionBar.l6.b(-0.02f, 0.15f, f10)))) {
            xw0Var.f51785c = r12;
            xw0Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        RectF rectF = ProfileActivity.V6;
        ProfileActivity profileActivity = this.U0;
        profileActivity.r4();
        profileActivity.getClass();
        org.telegram.ui.Components.nu0 nu0Var = profileActivity.S;
        if (nu0Var != null) {
            nu0Var.setTranslationX(f10 - profileActivity.r4());
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        RectF rectF = ProfileActivity.V6;
        ProfileActivity profileActivity = this.U0;
        if (profileActivity.S != null) {
            org.telegram.messenger.g0.L(3.0f);
            profileActivity.S.getVisibilityFactor();
        }
        org.telegram.ui.Components.nu0 nu0Var = profileActivity.S;
        if (nu0Var != null) {
            nu0Var.setTranslationY(f10 - org.telegram.messenger.g0.L(5.0f));
        }
    }
}
