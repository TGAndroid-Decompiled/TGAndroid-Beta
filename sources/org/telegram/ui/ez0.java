package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ez0 extends org.telegram.ui.Components.a90 {
    public final ProfileActivity M0;

    public ez0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.M0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.M0.B3();
    }

    @Override
    public final void setTextColor(int i10) {
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.M0;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f32121r;
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[2];
        if (k5Var != null) {
            k5Var.setTextColor(i10);
            k5VarArr[3].setTextColor(i10);
        }
        y01 y01Var = profileActivity.Y5;
        if (y01Var != null && y01Var.f40110c != (l1 = org.telegram.ui.ActionBar.j6.l1(1.4f, org.telegram.ui.ActionBar.j6.b(-0.02f, 0.15f, i10)))) {
            y01Var.f40110c = l1;
            y01Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        ProfileActivity profileActivity = this.M0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f32121r[2].setTranslationX(f10);
        profileActivity.f32121r[3].setTranslationX(f10);
        org.telegram.ui.Components.jw0 jw0Var = profileActivity.Q;
        if (jw0Var != null) {
            jw0Var.setTranslationX(f10 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ProfileActivity profileActivity = this.M0;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f32121r;
        if (profileActivity.Q != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.Q.getVisibilityFactor();
        }
        k5VarArr[2].setTranslationY(f10);
        k5VarArr[3].setTranslationY(f10);
        org.telegram.ui.Components.jw0 jw0Var = profileActivity.Q;
        if (jw0Var != null) {
            jw0Var.setTranslationY(f10 - AndroidUtilities.dp(5.0f));
        }
    }
}
