package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class e01 extends AnimatorListenerAdapter {
    public final int f36956a;
    public final boolean f36957b;
    public final ProfileActivity f36958c;

    public e01(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f36956a = i10;
        this.f36958c = profileActivity;
        this.f36957b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f36956a) {
            case 1:
                this.f36958c.f34089f0 = null;
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
        switch (this.f36956a) {
            case 0:
                ProfileActivity profileActivity = this.f36958c;
                boolean z10 = this.f36957b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.u0 u0Var = profileActivity.U0;
                    if (u0Var.F.getWidth() != 0 && !u0Var.f21315e.isFocused()) {
                        u0Var.f21315e.requestFocus();
                        AndroidUtilities.showKeyboard(u0Var.f21315e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.V1 = null;
                profileActivity.fragmentView.invalidate();
                if (z10) {
                    profileActivity.U4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.m2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.P.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f36958c;
                if (profileActivity2.f34089f0 != null && (z3Var = profileActivity2.f34096g0) != null) {
                    if (!this.f36957b) {
                        z3Var.setVisibility(4);
                    }
                    profileActivity2.f34089f0 = null;
                    return;
                }
                return;
        }
    }
}
