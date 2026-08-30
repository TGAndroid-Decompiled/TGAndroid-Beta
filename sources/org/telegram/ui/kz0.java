package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
public final class kz0 extends AnimatorListenerAdapter {
    public final int f35854a;
    public final boolean f35855b;
    public final ProfileActivity f35856c;

    public kz0(ProfileActivity profileActivity, boolean z4, int i10) {
        this.f35854a = i10;
        this.f35856c = profileActivity;
        this.f35855b = z4;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f35854a) {
            case 1:
                this.f35856c.f32044c0 = null;
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
        switch (this.f35854a) {
            case 0:
                ProfileActivity profileActivity = this.f35856c;
                boolean z4 = this.f35855b;
                ProfileActivity.n1(profileActivity, z4);
                profileActivity.V.setClickable(true);
                if (z4) {
                    org.telegram.ui.ActionBar.w0 w0Var = profileActivity.R0;
                    if (w0Var.C.getWidth() != 0 && !w0Var.e.isFocused()) {
                        w0Var.e.requestFocus();
                        AndroidUtilities.showKeyboard(w0Var.e);
                    }
                }
                profileActivity.k4(true);
                profileActivity.S1 = null;
                profileActivity.fragmentView.invalidate();
                if (z4) {
                    profileActivity.R4 = true;
                    profileActivity.F4();
                    Activity parentActivity = profileActivity.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.p2) profileActivity).classGuid;
                    AndroidUtilities.requestAdjustResize(parentActivity, i10);
                    profileActivity.M.setPreventMoving(false);
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity2 = this.f35856c;
                if (profileActivity2.f32044c0 != null && (y3Var = profileActivity2.f32050d0) != null) {
                    if (!this.f35855b) {
                        y3Var.setVisibility(4);
                    }
                    profileActivity2.f32044c0 = null;
                    return;
                }
                return;
        }
    }
}
