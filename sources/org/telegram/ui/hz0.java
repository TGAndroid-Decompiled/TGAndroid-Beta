package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class hz0 extends org.telegram.ui.Components.j90 {
    public final ProfileActivity P0;

    public hz0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.P0.B3();
    }

    @Override
    public final void setTextColor(int i10) {
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f31640r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[2];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[3].setTextColor(i10);
        }
        b11 b11Var = profileActivity.f31537b6;
        if (b11Var != null && b11Var.f32284c != (l1 = org.telegram.ui.ActionBar.h6.l1(1.4f, org.telegram.ui.ActionBar.h6.b(-0.02f, 0.15f, i10)))) {
            b11Var.f32284c = l1;
            b11Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f31640r[2].setTranslationX(f7);
        profileActivity.f31640r[3].setTranslationX(f7);
        org.telegram.ui.Components.uw0 uw0Var = profileActivity.T;
        if (uw0Var != null) {
            uw0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f31640r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        h5VarArr[2].setTranslationY(f7);
        h5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.uw0 uw0Var = profileActivity.T;
        if (uw0Var != null) {
            uw0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
