package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class c01 extends AnimatorListenerAdapter {
    public final int f36528a;
    public final boolean f36529b;
    public final ProfileActivity f36530c;

    public c01(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f36528a = i10;
        this.f36530c = profileActivity;
        this.f36529b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36528a) {
            case 1:
                this.f36530c.f34288f0 = null;
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
        switch (this.f36528a) {
            case 0:
                ProfileActivity profileActivity = this.f36530c;
                boolean z10 = this.f36529b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    if (v0Var.F.getWidth() != 0 && !v0Var.f21588e.isFocused()) {
                        v0Var.f21588e.requestFocus();
                        AndroidUtilities.showKeyboard(v0Var.f21588e);
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
                ProfileActivity profileActivity2 = this.f36530c;
                if (profileActivity2.f34288f0 != null && (z3Var = profileActivity2.f34295g0) != null) {
                    if (!this.f36529b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.f34288f0 = null;
                    return;
                }
                return;
        }
    }
}
