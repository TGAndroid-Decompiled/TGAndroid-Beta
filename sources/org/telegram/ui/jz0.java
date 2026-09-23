package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class jz0 extends org.telegram.ui.Components.y80 {
    public final ProfileActivity P0;

    public jz0(ProfileActivity profileActivity, Context context) {
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
        org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f31326r;
        org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[2];
        if (i5Var != null) {
            i5Var.setTextColor(i10);
            i5VarArr[3].setTextColor(i10);
        }
        d11 d11Var = profileActivity.f31223b6;
        if (d11Var != null && d11Var.f32480c != (l1 = org.telegram.ui.ActionBar.h6.l1(1.4f, org.telegram.ui.ActionBar.h6.b(-0.02f, 0.15f, i10)))) {
            d11Var.f32480c = l1;
            d11Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f31326r[2].setTranslationX(f7);
        profileActivity.f31326r[3].setTranslationX(f7);
        org.telegram.ui.Components.iw0 iw0Var = profileActivity.T;
        if (iw0Var != null) {
            iw0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f31326r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        i5VarArr[2].setTranslationY(f7);
        i5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.iw0 iw0Var = profileActivity.T;
        if (iw0Var != null) {
            iw0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
