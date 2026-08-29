package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ny0 extends org.telegram.ui.Components.t80 {
    public final ProfileActivity L0;

    public ny0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.L0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f9) {
        super.setAlpha(f9);
        this.L0.B3();
    }

    @Override
    public final void setTextColor(int i10) {
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.L0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36103r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[2];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[3].setTextColor(i10);
        }
        h01 h01Var = profileActivity.X5;
        if (h01Var != null && h01Var.f38713c != (l1 = org.telegram.ui.ActionBar.g6.l1(1.4f, org.telegram.ui.ActionBar.g6.b(-0.02f, 0.15f, i10)))) {
            h01Var.f38713c = l1;
            h01Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f9) {
        super.setTranslationX(f9);
        ProfileActivity profileActivity = this.L0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f36103r[2].setTranslationX(f9);
        profileActivity.f36103r[3].setTranslationX(f9);
        org.telegram.ui.Components.aw0 aw0Var = profileActivity.P;
        if (aw0Var != null) {
            aw0Var.setTranslationX(f9 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f9) {
        super.setTranslationY(f9);
        ProfileActivity profileActivity = this.L0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36103r;
        if (profileActivity.P != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.P.getVisibilityFactor();
        }
        h5VarArr[2].setTranslationY(f9);
        h5VarArr[3].setTranslationY(f9);
        org.telegram.ui.Components.aw0 aw0Var = profileActivity.P;
        if (aw0Var != null) {
            aw0Var.setTranslationY(f9 - AndroidUtilities.dp(5.0f));
        }
    }
}
