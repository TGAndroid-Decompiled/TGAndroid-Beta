package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class d01 extends AnimatorListenerAdapter {
    public final int f35614a;
    public final boolean f35615b;
    public final ProfileActivity f35616c;

    public d01(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f35614a = i10;
        this.f35616c = profileActivity;
        this.f35615b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35614a) {
            case 1:
                this.f35616c.f33923f0 = null;
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
        switch (this.f35614a) {
            case 0:
                ProfileActivity profileActivity = this.f35616c;
                boolean z10 = this.f35615b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    if (v0Var.F.getWidth() != 0 && !v0Var.f21411e.isFocused()) {
                        v0Var.f21411e.requestFocus();
                        AndroidUtilities.showKeyboard(v0Var.f21411e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.V1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.U4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.n2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f35616c;
                if (profileActivity2.f33923f0 != null && (y3Var = profileActivity2.f33930g0) != null) {
                    if (!this.f35615b) {
                        y3Var.setVisibility(4);
                    }
                    profileActivity2.f33923f0 = null;
                    return;
                }
                return;
        }
    }
}
