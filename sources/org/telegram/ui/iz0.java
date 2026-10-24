package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class iz0 extends AnimatorListenerAdapter {
    public final int f38411a;
    public final boolean f38412b;
    public final ProfileActivity f38413c;

    public iz0(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f38411a = i10;
        this.f38413c = profileActivity;
        this.f38412b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f38411a) {
            case 1:
                this.f38413c.f33929g0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.y3 y3Var;
        switch (this.f38411a) {
            case 0:
                ProfileActivity profileActivity = this.f38413c;
                boolean z10 = this.f38412b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.V0;
                    if (u0Var.F.getWidth() != 0 && !u0Var.e.isFocused()) {
                        u0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(u0Var.e);
                    }
                }
                profileActivity.m4(true);
                profileActivity.W1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.W4 = true;
                    profileActivity.H4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f38413c;
                if (profileActivity2.f33929g0 != null && (y3Var = profileActivity2.f33936h0) != null) {
                    if (!this.f38412b) {
                        y3Var.setVisibility(4);
                    }
                    profileActivity2.f33929g0 = null;
                    return;
                }
                return;
        }
    }
}
