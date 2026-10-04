package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kz0 extends org.telegram.ui.Components.l90 {
    public final ProfileActivity P0;

    public kz0(ProfileActivity profileActivity, Context context) {
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
        org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f34326r;
        org.telegram.ui.ActionBar.i5 i5Var = i5VarArr[2];
        if (i5Var != null) {
            i5Var.setTextColor(i10);
            i5VarArr[3].setTextColor(i10);
        }
        d11 d11Var = profileActivity.f34222b6;
        if (d11Var != null && d11Var.f35613c != (l1 = org.telegram.ui.ActionBar.i6.l1(1.4f, org.telegram.ui.ActionBar.i6.b(-0.02f, 0.15f, i10)))) {
            d11Var.f35613c = l1;
            d11Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f34326r[2].setTranslationX(f7);
        profileActivity.f34326r[3].setTranslationX(f7);
        org.telegram.ui.Components.ex0 ex0Var = profileActivity.T;
        if (ex0Var != null) {
            ex0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f34326r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        i5VarArr[2].setTranslationY(f7);
        i5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.ex0 ex0Var = profileActivity.T;
        if (ex0Var != null) {
            ex0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
