package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class d01 extends AnimatorListenerAdapter {
    public final int f35586a;
    public final boolean f35587b;
    public final ProfileActivity f35588c;

    public d01(ProfileActivity profileActivity, boolean z10, int i10) {
        this.f35586a = i10;
        this.f35588c = profileActivity;
        this.f35587b = z10;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35586a) {
            case 1:
                this.f35588c.f33895f0 = null;
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
        switch (this.f35586a) {
            case 0:
                ProfileActivity profileActivity = this.f35588c;
                boolean z10 = this.f35587b;
                ProfileActivity.n1(profileActivity, z10);
                profileActivity.Y.setClickable(true);
                if (z10) {
                    org.telegram.ui.ActionBar.v0 v0Var = profileActivity.U0;
                    if (v0Var.F.getWidth() != 0 && !v0Var.f21383e.isFocused()) {
                        v0Var.f21383e.requestFocus();
                        AndroidUtilities.showKeyboard(v0Var.f21383e);
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
                ProfileActivity profileActivity2 = this.f35588c;
                if (profileActivity2.f33895f0 != null && (y3Var = profileActivity2.f33902g0) != null) {
                    if (!this.f35587b) {
                        y3Var.setVisibility(4);
                    }
                    profileActivity2.f33895f0 = null;
                    return;
                }
                return;
        }
    }
}
