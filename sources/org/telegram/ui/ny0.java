package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ny0 extends org.telegram.ui.Components.g80 {
    public final ProfileActivity L0;

    public ny0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.L0 = profileActivity;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.L0.B3();
    }

    @Override
    public final void setTextColor(int i9) {
        int l1;
        super.setTextColor(i9);
        ProfileActivity profileActivity = this.L0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36037r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[2];
        if (h5Var != null) {
            h5Var.setTextColor(i9);
            h5VarArr[3].setTextColor(i9);
        }
        g01 g01Var = profileActivity.X5;
        if (g01Var != null && g01Var.f38404c != (l1 = org.telegram.ui.ActionBar.f6.l1(1.4f, org.telegram.ui.ActionBar.f6.b(-0.02f, 0.15f, i9)))) {
            g01Var.f38404c = l1;
            g01Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        ProfileActivity profileActivity = this.L0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f36037r[2].setTranslationX(f10);
        profileActivity.f36037r[3].setTranslationX(f10);
        org.telegram.ui.Components.qv0 qv0Var = profileActivity.P;
        if (qv0Var != null) {
            qv0Var.setTranslationX(f10 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ProfileActivity profileActivity = this.L0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36037r;
        if (profileActivity.P != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.P.getVisibilityFactor();
        }
        h5VarArr[2].setTranslationY(f10);
        h5VarArr[3].setTranslationY(f10);
        org.telegram.ui.Components.qv0 qv0Var = profileActivity.P;
        if (qv0Var != null) {
            qv0Var.setTranslationY(f10 - AndroidUtilities.dp(5.0f));
        }
    }
}
