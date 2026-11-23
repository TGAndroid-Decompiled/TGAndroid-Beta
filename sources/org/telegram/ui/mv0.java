package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
public final class mv0 extends AnimatorListenerAdapter {
    public final int f50118a;
    public final boolean f50119b;
    public final ProfileActivity f50120c;

    public mv0(ProfileActivity profileActivity, boolean z10, int i7) {
        this.f50118a = i7;
        this.f50120c = profileActivity;
        this.f50119b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f50118a) {
            case 1:
                this.f50120c.f43680g0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i7;
        org.telegram.ui.Cells.c4 c4Var;
        switch (this.f50118a) {
            case 0:
                ProfileActivity profileActivity = this.f50120c;
                boolean z10 = this.f50119b;
                ProfileActivity.y1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.g5 g5Var = profileActivity.U0;
                    if (g5Var.G.getWidth() != 0 && !g5Var.f29964e.isFocused()) {
                        g5Var.f29964e.requestFocus();
                        org.telegram.messenger.g0.I3(g5Var.f29964e);
                    }
                }
                profileActivity.B4(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.Y4 = true;
                    profileActivity.W4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i7 = ((org.telegram.ui.ActionBar.g2) profileActivity).classGuid;
                    org.telegram.messenger.g0.Z2(parentActivity, i7);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f50120c;
                if (profileActivity2.f43680g0 != null && (c4Var = profileActivity2.f43687h0) != null) {
                    if (!this.f50119b) {
                        c4Var.setVisibility(4);
                    }
                    profileActivity2.f43680g0 = null;
                    return;
                }
                return;
        }
    }
}
