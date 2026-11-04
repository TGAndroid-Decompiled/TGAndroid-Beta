package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class ev0 extends AnimatorListenerAdapter {
    public final int f45053a;
    public final boolean f45054b;
    public final ProfileActivity f45055c;

    public ev0(ProfileActivity profileActivity, boolean z10, int i3) {
        this.f45053a = i3;
        this.f45055c = profileActivity;
        this.f45054b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f45053a) {
            case 1:
                this.f45055c.f41765g0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i3;
        org.telegram.ui.Cells.b4 b4Var;
        switch (this.f45053a) {
            case 0:
                ProfileActivity profileActivity = this.f45055c;
                boolean z10 = this.f45054b;
                ProfileActivity.y1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.f5 f5Var = profileActivity.U0;
                    if (f5Var.G.getWidth() != 0 && !f5Var.f28445e.isFocused()) {
                        f5Var.f28445e.requestFocus();
                        org.telegram.messenger.g0.K3(f5Var.f28445e);
                    }
                }
                profileActivity.y4(true);
                profileActivity.V1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.V4 = true;
                    profileActivity.T4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i3 = ((org.telegram.ui.ActionBar.d2) profileActivity).classGuid;
                    org.telegram.messenger.g0.a3(parentActivity, i3);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f45055c;
                if (profileActivity2.f41765g0 != null && (b4Var = profileActivity2.f41772h0) != null) {
                    if (!this.f45054b) {
                        b4Var.setVisibility(4);
                    }
                    profileActivity2.f41765g0 = null;
                    return;
                }
                return;
        }
    }
}
