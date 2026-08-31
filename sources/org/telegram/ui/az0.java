package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class az0 extends org.telegram.ui.Components.b90 {
    public final ProfileActivity M0;

    public az0(ProfileActivity profileActivity, Context context) {
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
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f34680r;
        org.telegram.ui.ActionBar.l5 l5Var = l5VarArr[2];
        if (l5Var != null) {
            l5Var.setTextColor(i10);
            l5VarArr[3].setTextColor(i10);
        }
        t01 t01Var = profileActivity.Y5;
        if (t01Var != null && t01Var.f41420c != (l1 = org.telegram.ui.ActionBar.k6.l1(1.4f, org.telegram.ui.ActionBar.k6.b(-0.02f, 0.15f, i10)))) {
            t01Var.f41420c = l1;
            t01Var.invalidateSelf();
        }
    }

    @Override
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        ProfileActivity profileActivity = this.M0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.f34680r[2].setTranslationX(f10);
        profileActivity.f34680r[3].setTranslationX(f10);
        org.telegram.ui.Components.kw0 kw0Var = profileActivity.Q;
        if (kw0Var != null) {
            kw0Var.setTranslationX(f10 - profileActivity.Z3());
        }
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ProfileActivity profileActivity = this.M0;
        org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f34680r;
        if (profileActivity.Q != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.Q.getVisibilityFactor();
        }
        l5VarArr[2].setTranslationY(f10);
        l5VarArr[3].setTranslationY(f10);
        org.telegram.ui.Components.kw0 kw0Var = profileActivity.Q;
        if (kw0Var != null) {
            kw0Var.setTranslationY(f10 - AndroidUtilities.dp(5.0f));
        }
    }
}
