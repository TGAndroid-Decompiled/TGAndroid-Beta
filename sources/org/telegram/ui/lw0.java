package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
public final class lw0 extends org.telegram.ui.Components.v4 {
    public final ProfileActivity U0;

    public lw0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.U0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        RectF rectF = ProfileActivity.R6;
        this.U0.P3();
    }

    @Override
    public final void setTextColor(int i10) {
        int r12;
        ProfileActivity profileActivity = this.U0;
        profileActivity.E5 = i10;
        int f7 = i0.b.f(profileActivity.A5, i10, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21311y6, profileActivity.f33950z0));
        super.setTextColor(f7);
        iy0 iy0Var = profileActivity.f33942x6;
        if (iy0Var != null && iy0Var.f38376c != (r12 = org.telegram.ui.ActionBar.t6.r1(1.4f, org.telegram.ui.ActionBar.t6.b(-0.02f, 0.15f, f7)))) {
            iy0Var.f38376c = r12;
            iy0Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        RectF rectF = ProfileActivity.R6;
        ProfileActivity profileActivity = this.U0;
        profileActivity.o4();
        profileActivity.getClass();
        org.telegram.ui.Components.nv0 nv0Var = profileActivity.S;
        if (nv0Var != null) {
            nv0Var.setTranslationX(f7 - profileActivity.o4());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        RectF rectF = ProfileActivity.R6;
        ProfileActivity profileActivity = this.U0;
        if (profileActivity.S != null) {
            org.telegram.messenger.i0.L(3.0f);
            profileActivity.S.getVisibilityFactor();
        }
        org.telegram.ui.Components.nv0 nv0Var = profileActivity.S;
        if (nv0Var != null) {
            nv0Var.setTranslationY(f7 - org.telegram.messenger.i0.L(5.0f));
        }
    }
}
