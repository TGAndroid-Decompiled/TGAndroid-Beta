package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class c01 extends AnimatorListenerAdapter {
    public final int f36484a;
    public final boolean f36485b;
    public final ProfileActivity f36486c;

    public c01(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f36484a = i10;
        this.f36486c = profileActivity;
        this.f36485b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36484a) {
            case 1:
                this.f36486c.f34250f0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        org.telegram.ui.Cells.z3 z3Var;
        switch (this.f36484a) {
            case 0:
                ProfileActivity profileActivity = this.f36486c;
                boolean z10 = this.f36485b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    if (v0Var.F.getWidth() != 0 && !v0Var.f21584e.isFocused()) {
                        v0Var.f21584e.requestFocus();
                        AndroidUtilities.showKeyboard(v0Var.f21584e);
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
                ProfileActivity profileActivity2 = this.f36486c;
                if (profileActivity2.f34250f0 != null && (z3Var = profileActivity2.f34257g0) != null) {
                    if (!this.f36485b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.f34250f0 = null;
                    return;
                }
                return;
        }
    }
}
